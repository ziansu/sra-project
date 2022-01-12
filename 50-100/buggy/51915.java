@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    LOAD_LIST.add("Sup");
    LOAD_LIST.add("Save2");
    android.widget.Button rollDice = ((android.widget.Button) (findViewById(R.id.rollButton)));
    android.widget.Button saveDice = ((android.widget.Button) (findViewById(R.id.saveButton1)));
    android.widget.Button loadDice = ((android.widget.Button) (findViewById(R.id.loadButton1)));
    handle = new com.example.david.diceroller.MyDBHandler(this, null, null, 1);
}