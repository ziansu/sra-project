public void initView() {
    butterknife.ButterKnife.bind(this);
    setSupportActionBar(toolbar);
    if ((getSupportActionBar()) != null) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }
    toolbar.setNavigationOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            android.content.Intent intent = new android.content.Intent(v.getContext(), com.jerry.notes.Activities.Login.class);
            startActivity(intent);
        }
    });
}