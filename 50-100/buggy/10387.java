@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    closeAppIfRequired();
    setContentView(R.layout.main_menu);
    findViewById(R.id.new_game_button).setOnClickListener(this);
    findViewById(R.id.records_button).setOnClickListener(this);
    findViewById(R.id.about_the_game_button).setOnClickListener(this);
    findViewById(R.id.quit_button).setOnClickListener(this);
}