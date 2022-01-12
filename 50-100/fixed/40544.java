@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_play);
    getSupportActionBar().hide();
    myDB = new com.example.evitected.math_piece.ClassModel.DatabaseSQLite(this, 2);
    bindWidget();
    setFontAwesome();
    CheckDevice_State();
}