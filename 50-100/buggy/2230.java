@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    if ((dataSnapshot.getValue()) != null) {
        isUserExist = true;
        try {
            isUserExist = true;
            startPhoneNumberVerification(("+91" + (userId.getText().toString())));
        } catch (java.lang.Exception e) {
            isUserExist = true;
        }
    }else {
        isUserExist = false;
        contentLayout.setVisibility(View.VISIBLE);
        mProgressBar.setVisibility(View.INVISIBLE);
        showMsgDialog("Warning!", "User Does not Exist", R.drawable.error_small, 0);
    }
}