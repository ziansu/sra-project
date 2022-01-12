@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_unlock_computer);
    android.content.Intent intent = new android.content.Intent(getBaseContext(), com.maxchehab.remotelinuxunlocker.ComputerListActivity.class);
    intent.putExtra("command", "unlock");
    startActivity(intent);
    finish();
}