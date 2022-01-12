@java.lang.Override
public void onClick(android.view.View view) {
    if (!(mRespondToClick))
        return ;
    
    switch (view.getId()) {
        case R.id.list_item_root :
            int newlySelectedPos = this.setSelection(mStationId, false);
            mListener.onStationListItemClick(StationListFragment.STATION_LIST_ITEM_CLICK_PATH);
            mFabAnimationRequested = newlySelectedPos != (mSelectedPos);
            break;
        case R.id.favorite_fab :
            mListener.onStationListItemClick(StationListFragment.STATION_LIST_FAVORITE_FAB_CLICK_PATH);
            if (getSelected().isFavorite(mCtx))
                mFavoriteFab.setImageResource(R.drawable.ic_action_favorite_24dp);
            else
                mFavoriteFab.setImageResource(R.drawable.ic_action_favorite_outline_24dp);
            
            break;
    }
}