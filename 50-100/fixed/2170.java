public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.GoTobutton :
            calName = calSel.getSelectedItem().toString();
            calID = spinnerCalCheck();
            sonoma.teatimeremake.util.GroupCalendarUtil.findID = calID;
            startActivity(new android.content.Intent(this, sonoma.teatimeremake.GroupCalendarActivity.class));
            break;
        case R.id.MakeNewCalendarButton :
            startActivity(new android.content.Intent(this, sonoma.teatimeremake.NewCalendarActivity.class));
            break;
        case R.id.inviteActivity :
            startActivity(new android.content.Intent(this, sonoma.teatimeremake.InvitingOtherPeopleActivity.class));
            break;
        default :
            break;
    }
}