@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int id) {
    android.content.Intent intent = new android.content.Intent(this, cs460.grouple.grouple.InviteActivity.class);
    intent.putExtra("email", user.getEmail());
    intent.putExtra("g_id", g_id);
    startActivity(intent);
    finish();
}