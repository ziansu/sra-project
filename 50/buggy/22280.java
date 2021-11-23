@java.lang.Override
public void onClick(android.view.View view) {
    startActivity(new android.content.Intent(getApplicationContext(), appcorp.mmb.activities.feeds.ManicureFeed.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK));
}