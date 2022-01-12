@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == 1) {
        android.widget.TextView invitePeople = ((android.widget.TextView) (findViewById(R.id.btn_invite_people)));
        numberInvited = data.getIntExtra("numberInvited", 0);
        invitePeople.setText((("" + (numberInvited)) + " people invited"));
    }
    super.onActivityResult(requestCode, resultCode, data);
}