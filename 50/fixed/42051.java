@java.lang.Override
public void onClick(android.view.View v) {
    if ((v.getId()) == (R.id.create_message)) {
        startActivity(new android.content.Intent(this, com.example.yass8n.whozthis.activities.NewMessages.class));
    }
}