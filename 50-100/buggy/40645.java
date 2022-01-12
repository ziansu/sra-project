@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.widget.Button next_compliment = ((android.widget.Button) (findViewById(R.id.next_Compliment)));
    android.widget.TextView main_text = ((android.widget.TextView) (findViewById(R.id.main_text)));
    assert main_text != null;
    main_text.setText(default_text);
    assert next_compliment != null;
    next_compliment.setText("Готова!");
    on.ddm.onlyfy.DBHelper dbHelper = new on.ddm.onlyfy.DBHelper(this);
    pito = new on.ddm.onlyfy.Pito_roboto(dbHelper, this);
}