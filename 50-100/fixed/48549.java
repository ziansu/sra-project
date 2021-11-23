@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.tap_out_home);
    java.lang.System.gc();
    play = ((android.widget.LinearLayout) (findViewById(R.id.pp)));
    pl = ((android.widget.TextView) (findViewById(R.id.play)));
    play.setOnClickListener(this);
}