@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int id) {
    android.content.Intent intent = new android.content.Intent(this, cs460.grouple.grouple.EventAddGroupsActivity.class);
    intent.putExtra("CONTENT", "EVENT");
    intent.putExtra("e_id", java.lang.Integer.parseInt(ID));
    intent.putExtra("email", user.getEmail());
    startActivity(intent);
    finish();
}