@java.lang.Override
public void canCreateCallback(boolean canCreate) {
    if (canCreate) {
        newPartyController.create(this, partyName.getText().toString());
        android.content.Intent partyAdminIntent = new android.content.Intent(this, com.myousic.activities.ActivityPartyAdmin.class);
        startActivity(partyAdminIntent);
    }else {
        android.widget.Toast.makeText(this, "This party is name is taken by someone else", Toast.LENGTH_SHORT).show();
    }
}