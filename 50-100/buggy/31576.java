@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    btnNewGame = ((android.widget.Button) (findViewById(R.id.newGameBtn)));
    btnOpenGame = ((android.widget.Button) (findViewById(R.id.openGameBtn)));
    signInBtn = ((com.google.android.gms.common.SignInButton) (findViewById(R.id.sign_in_button)));
    btnNewGame.setOnClickListener(this);
    btnOpenGame.setOnClickListener(this);
    signInBtn.setOnClickListener(this);
    checkPerm();
}