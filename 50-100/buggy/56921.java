@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_character_list);
    butterknife.ButterKnife.bind(this);
    mToolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(mToolbar);
    mToolbar.setTitle(getTitle());
    assert (mRecyclerView) != null;
    setupRecyclerView(mRecyclerView);
    if ((findViewById(R.id.character_detail_container)) != null) {
        mTwoPane = true;
    }
}