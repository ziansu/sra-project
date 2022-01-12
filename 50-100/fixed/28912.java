public void shareFab(android.support.design.widget.FloatingActionButton fab) {
    if (fab == null) {
        if ((mSharedFab) != null) {
            mSharedFab.setOnClickListener(null);
        }
        mSharedFab = null;
    }else {
        mSharedFab = fab;
        mSharedFab.setOnClickListener(this);
        mSheetLayout.setFab(mSharedFab);
        mSheetLayout.setFabAnimationEndListener(this);
        fab.setImageResource(R.mipmap.ic_add_white_24dp);
    }
}