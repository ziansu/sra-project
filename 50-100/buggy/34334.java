@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_configure);
    v_listview_allRules = ((android.widget.ListView) (findViewById(R.id.listview_allRules)));
    loadRulesData();
    v_btn_deleteSelRules = ((android.widget.Button) (findViewById(R.id.btn_deleteSelRules)));
    v_btn_deleteSelRules.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            deleteSelRules();
        }
    });
}