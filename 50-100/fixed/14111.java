protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    senpai_id = ((android.widget.EditText) (findViewById(R.id.senpai_id)));
    Textname = ((android.widget.TextView) (findViewById(R.id.Textname)));
    dbHandler = new com.example.work.senpainoticeme.DBHandler(this, null, null, 1);
    printDatabase();
    notification = new android.support.v4.app.NotificationCompat.Builder(this);
    notification.setAutoCancel(true);
}