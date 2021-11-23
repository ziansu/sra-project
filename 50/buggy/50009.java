@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.os.Bundle extras = getIntent().getExtras();
    data_gender = extras.getString("gender");
    setContentView(R.layout.activity_registration_interests);
}