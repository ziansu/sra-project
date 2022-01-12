@java.lang.Override
public void onClick(android.view.View v) {
    if (null != (mDrawerContentClickListener)) {
        mDrawerActions.get(mCurrActionIndex).isActive = !(mDrawerActions.get(mCurrActionIndex).isActive);
        mDrawerContentClickListener.onDrawActionClicked(mDrawerActions.get((position - 1)));
        mCurrActionIndex = position - 1;
        mDrawerActions.get(mCurrActionIndex).isActive = !(mDrawerActions.get(mCurrActionIndex).isActive);
        notifyDataSetChanged();
    }
    mDrawerLayout.closeDrawer();
}