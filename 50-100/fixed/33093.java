@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    adapter = new org.brickred.socialauth.android.SocialAuthAdapter(new com.example.prabhendu.connectme.MainActivity.ResponseListener());
    android.widget.ImageButton loginButton = ((android.widget.ImageButton) (findViewById(R.id.loginButton)));
    loginButton.setOnClickListener(new android.view.View.OnClickListener() {
        public void onClick(android.view.View v) {
            adapter.authorize(com.example.prabhendu.connectme.MainActivity.this, Provider.LINKEDIN);
        }
    });
}