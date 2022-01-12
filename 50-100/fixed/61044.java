@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_student);
    setContentView(R.layout.activity_student);
    bLogout = ((android.widget.Button) (findViewById(R.id.bLogout)));
    bLogout.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            com.example.svilen.p8.UserInfo userinfo = new com.example.svilen.p8.UserInfo(getApplicationContext());
            userinfo.logOut();
        }
    });
}