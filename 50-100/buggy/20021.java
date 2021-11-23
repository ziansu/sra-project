private void initSupportActionBar(android.view.View rootView) {
    mToolbar = ((android.support.v7.widget.Toolbar) (rootView.findViewById(R.id.toolbar)));
    ((android.support.v7.app.AppCompatActivity) (getActivity())).setSupportActionBar(mToolbar);
    samurai.geeft.android.geeft.fragments.ActionBar actionBar = ((android.support.v7.app.AppCompatActivity) (getActivity())).getSupportActionBar();
    actionBar.setHomeButtonEnabled(true);
    actionBar.setDisplayHomeAsUpEnabled(true);
    actionBar.setDisplayShowTitleEnabled(false);
    actionBar.setTitle("Profilo");
}