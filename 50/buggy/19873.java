@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    butterknife.ButterKnife.bind(this);
    setContentView(R.layout.activity_main);
    setSupportActionBar(toolbar);
}