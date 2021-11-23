@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    sp = getSharedPreferences("my_HS", Activity.MODE_PRIVATE);
    editor = sp.edit();
    super.onCreate(savedInstanceState);
    setContentView(R.layout.simon_game);
    cpuInput.add(randomNumber);
}