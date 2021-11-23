@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_monster_choose);
    android.content.Intent intent = getIntent();
    java.lang.String theName = intent.getStringExtra("pName");
    android.widget.TextView nametextView = ((android.widget.TextView) (findViewById(R.id.name)));
    nametextView.setTextSize(20);
    nametextView.setText(theName);
}