@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intentSendBack = new android.content.Intent(this, com.example.matthew.scheduleme.UserHome.class);
    java.util.ArrayList<java.lang.String> temp = new java.util.ArrayList<java.lang.String>();
    if ((eventStrings) != null) {
        temp.addAll(eventStrings);
    }
    intentSendBack.putExtra("testUser", theUser);
    startActivity(intentSendBack);
}