@java.lang.Override
public void onClick(android.view.View v) {
    if (null != (mDrawerContentClickListener)) {
        mDrawerActions.get(mCurrActionIndex).isActive = !(mDrawerActions.get(mCurrActionIndex).isActive);
        mDrawerContentClickListener.onDrawActionClicked(mDrawerActions.get(position));
        mCurrActionIndex = position;
        mDrawerActions.get(mCurrActionIndex).isActive = !(mDrawerActions.get(mCurrActionIndex).isActive);
        notifyDataSetChanged();
    }
    mDrawerLayout.closeDrawer();
}