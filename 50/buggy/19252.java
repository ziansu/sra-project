@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_VISIBLE);
    super.onCreate(savedInstanceState);
    butterknife.ButterKnife.bind(this);
    init();
    getAllComments();
}