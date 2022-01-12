@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_guest_list);
    activity = this;
    lvGuest = ((android.widget.ListView) (findViewById(R.id.lvGuest)));
    ibtnSearch = ((android.widget.ImageButton) (findViewById(R.id.ibtnSearch)));
    ibtnBack = ((android.widget.ImageButton) (findViewById(R.id.ibtnBack)));
    fillDummyData();
    ibtnSearch.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
        }
    });
}