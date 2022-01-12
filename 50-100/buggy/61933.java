@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_bonus_round);
    btns = ((android.widget.GridLayout) (findViewById(R.id.gridButtons)));
    btnList = new java.util.ArrayList<>();
    allButtons();
    initialSetup();
}