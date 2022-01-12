@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.riddle_win);
    nameofRiddle = getIntent().getExtras().getString("name");
    id = getIntent().getExtras().getInt("id");
}