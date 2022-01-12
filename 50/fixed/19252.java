@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    butterknife.ButterKnife.bind(this);
    init();
    getAllComments();
}