@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    progressBar.setVisibility(View.GONE);
    startActivity(new android.content.Intent(this, com.example.xmppchatsampleproject.ChatOptionActivity.class));
    android.os.Bundle extras = getIntent().getExtras();
    if (extras != null) {
        java.lang.String messageContent = extras.getString("xmpp_status");
        if ((messageContent != null) && (messageContent.equals("success"))) {
        }else {
            android.widget.Toast.makeText(this, "Somthing went wrong. try again", Toast.LENGTH_SHORT).show();
        }
    }
}