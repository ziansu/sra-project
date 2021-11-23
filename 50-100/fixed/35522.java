@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_edit_notice);
    notice = getIntent().getParcelableExtra("tree");
    path = getIntent().getStringExtra("file");
    noticeText = ((android.widget.EditText) (findViewById(R.id.editNotice)));
    noticeText.setText(notice.getContent());
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
}