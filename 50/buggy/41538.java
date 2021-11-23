@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, com.example.user.timekeeper.StatusActivity.class);
    startActivity(intent);
    if (checkIns.isEmpty()) {
    }
}