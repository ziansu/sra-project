@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.resultactivity);
    eng.waterloo.what2eat.ResultActivity.displayTV = ((android.widget.TextView) (findViewById(R.id.resultTV)));
    eng.waterloo.what2eat.ResultActivity.displayTV.setText("Getting Results...");
    eng.waterloo.what2eat.ResultActivity.backToMenuButton = ((android.widget.Button) (findViewById(R.id.returnMenuButton)));
    eng.waterloo.what2eat.ResultActivity.backToMenuButton.setClickable(true);
    DBEventListener();
    getHighest();
}