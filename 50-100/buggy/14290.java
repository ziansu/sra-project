@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    app = ((com.android.anurag.notesapp.SendNoteApplication) (getApplicationContext()));
    chatActivity = app.getChatActivity();
    android.content.Intent intent = getIntent();
    senderName = intent.getStringExtra("sender_name");
    message = intent.getStringExtra("msg");
    createDialogAndTimer(senderName, message).show();
    timer.start();
}