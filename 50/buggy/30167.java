@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent startNewActivity = new android.content.Intent(getApplicationContext(), com.example.danielfox.foodchoices.NewVisit.class);
    startNewActivity.putExtra("name", username);
    startNewActivity.putExtra("userID", userID);
    startActivity(startNewActivity);
    finish();
}