@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Name = ((android.widget.EditText) (findViewById(R.id.editText)));
    Pass = ((android.widget.EditText) (findViewById(R.id.editText2)));
    helper = new com.example.sqliteinsert.myDbAdapter(this);
    context = this;
}