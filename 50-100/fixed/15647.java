@java.lang.Override
public void onMenuItemClick(android.view.View clickedView, int position) {
    switch (position) {
        case 0 :
            break;
        case 1 :
            android.content.Intent editProfileIntent = new android.content.Intent(this, dingdiling.wordk.user.EditProfileActivity.class);
            editProfileIntent.putExtra(Config.USER_EMAIL, email);
            startActivity(editProfileIntent);
            break;
        case 2 :
            logoutConfirmAlert();
            break;
    }
}