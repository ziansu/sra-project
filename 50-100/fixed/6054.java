@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_launch);
    if (true) {
        android.content.Intent myIntent = new android.content.Intent(this, com.mywallet.sirva.mywallet.Activity.MainActivity.class);
        myIntent.setFlags(((android.content.Intent.FLAG_ACTIVITY_NEW_TASK) | (android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK)));
        this.startActivity(myIntent);
    }else {
        android.content.Intent myIntent = new android.content.Intent(this, com.mywallet.sirva.mywallet.Activity.LoginActivity.class);
        myIntent.setFlags(((android.content.Intent.FLAG_ACTIVITY_NEW_TASK) | (android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK)));
        this.startActivity(myIntent);
    }
}