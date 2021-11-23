@java.lang.Override
public void onClick(android.view.View v) {
    if (!(currentProfile.isDefaultUser())) {
        android.content.Intent intent = new android.content.Intent(this, com.teamname.tutortrader.AddSessionActivity.class);
        startActivity(intent);
    }else {
        android.widget.Toast.makeText(this, "You need to have a profile to use this feature.\n Please connect to internet to continue", Toast.LENGTH_LONG).show();
    }
}