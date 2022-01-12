@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    final android.widget.ListView lv_list = ((android.widget.ListView) (findViewById(R.id.lv_list)));
    setSupportActionBar(toolbar);
    com.enterprise.wrapup.wrapup.ListActivity.setMainList(lv_list);
}