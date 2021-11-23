@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_section1_select);
    view_levels = ((android.widget.TextView) (findViewById(R.id.levels)));
    view_coins = ((android.widget.TextView) (findViewById(R.id.coins)));
    view_coins.setText(java.lang.Integer.toString(MainActivity.coins));
    view_levels.setText(java.lang.Integer.toString(MainActivity.levels_summ));
    onResume();
}