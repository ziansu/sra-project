@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main_menu);
    level = ((android.widget.Button) (findViewById(R.id.StG)));
    theory = ((android.widget.Button) (findViewById(R.id.lib)));
    developers = ((android.widget.Button) (findViewById(R.id.opt)));
    level.setBackgroundColor(Color.TRANSPARENT);
    theory.setBackgroundColor(Color.TRANSPARENT);
    developers.setBackgroundColor(Color.TRANSPARENT);
}