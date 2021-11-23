@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (((facebookHelper) != null) && (resultCode != (android.app.Activity.RESULT_CANCELED))) {
        facebookHelper.onActivityResult(requestCode, resultCode, data);
    }else {
        com.quickblox.q_municate.utils.helpers.FacebookHelper.logout();
    }
}