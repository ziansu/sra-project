protected void setFab() {
    mFab = ((android.support.design.widget.FloatingActionButton) (findViewById(R.id.fab_delete)));
    if ((mFab) != null) {
        mFab.setOnClickListener(new android.view.View.OnClickListener() {
            @java.lang.Override
            public void onClick(android.view.View v) {
                mHistoryDatabase.clearDatabase();
                android.support.design.widget.Snackbar.make(v, "Search history deleted", Snackbar.LENGTH_LONG).setAction("Action", null).show();
            }
        });
    }
}