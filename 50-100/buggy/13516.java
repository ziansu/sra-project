@android.annotation.TargetApi(value = Build.VERSION_CODES.JELLY_BEAN)
@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_make_decision);
    android.content.Intent intent = new android.content.Intent();
    editingId = intent.getLongExtra("editingId", 0);
    realm = io.realm.Realm.getDefaultInstance();
    decisionQuestion = ((android.widget.EditText) (findViewById(R.id.edt_decision_question)));
    add_decision = ((com.ivart.makedecision.Activities.FloatingActionButton) (findViewById(R.id.btn_add_decision)));
    add_decision.setOnClickListener(this);
}