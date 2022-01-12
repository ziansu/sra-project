@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_registration_interests);
    android.os.Bundle extras = getIntent().getExtras();
    data_gender = extras.getString("gender");
}