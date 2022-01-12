@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.estimate);
    android.content.Intent i = getIntent();
    curconext = this;
    dbref = new kgecproject.practice.demo.calendardemo.MySQLiteSecond(curconext);
    edu = ((android.widget.EditText) (findViewById(R.id.editText1)));
    trans = ((android.widget.EditText) (findViewById(R.id.editText2)));
    enter = ((android.widget.EditText) (findViewById(R.id.editText3)));
    foo = ((android.widget.EditText) (findViewById(R.id.editText4)));
}