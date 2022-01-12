@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_latest);
    currentUser = com.cmput301w17t08.moodr.CurrentUserSingleton.getInstance().getUser();
    android.content.Intent intent = getIntent();
    moodsListview.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
        @java.lang.Override
        public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
        }
    });
}