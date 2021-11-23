@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_register);
    grid = ((android.widget.GridView) (findViewById(R.id.grid)));
    firstNameTv = new android.widget.TextView(this);
    firstNameEt = new android.widget.EditText(this);
    firstNameTv.setText("First Name: ");
    grid.addView(firstNameTv);
    grid.addView(firstNameEt);
}