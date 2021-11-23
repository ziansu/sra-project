@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    if ((dataSnapshot.getValue()) == null)
        new com.whirlwind.school1.popup.SnackbarPopup("You aren't logged in a schooool", android.support.design.widget.Snackbar.LENGTH_INDEFINITE, false).setAction("Open me", new android.view.View.OnClickListener() {
            @java.lang.Override
            public void onClick(android.view.View view) {
                startActivity(new android.content.Intent(com.whirlwind.school1.activity.MainActivity.this, com.whirlwind.school1.activity.SchoolLoginActivity.class));
            }
        }).show(this);
    else {
        android.widget.TextView school = headerView.findViewById(R.id.navigation_header_layout_school);
        school.setText(java.lang.String.valueOf(dataSnapshot.getValue()));
    }
}