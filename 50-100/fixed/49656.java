@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    currentAns = 0;
    currentOperator = "";
    prevAns = 0;
    previnput = "";
    i = 0;
    btnStrings = getResources().getStringArray(R.array.buttons);
    setupButtons();
    tvValue = ((android.widget.TextView) (findViewById(R.id.tvValue)));
}