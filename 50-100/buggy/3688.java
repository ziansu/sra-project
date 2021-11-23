@java.lang.Override
protected android.support.v4.app.Fragment createFragment() {
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    android.support.design.widget.FloatingActionButton fab = ((android.support.design.widget.FloatingActionButton) (findViewById(R.id.fab)));
    fab.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View view) {
            android.support.design.widget.Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
        }
    });
    return new com.zaksid.dev.android.training.bignerdranch.criminalintent.CrimeListFragment();
}