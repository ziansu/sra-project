@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    init();
    sp = new com.linhnv.foodsy.model.SP(this);
    if (sp.getStateLogin()) {
        startActivity(new android.content.Intent(this, com.linhnv.foodsy.activity.MenuActivity.class));
        finish();
    }
}