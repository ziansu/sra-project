@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (resultCode != (RESULT_OK))
        return ;
    
    switch (requestCode) {
        case ya.haojun.roadtoadventure.activity.MainActivity.REQUEST_PROFILE :
            if (data.getBooleanExtra("logout", false)) {
                ya.haojun.roadtoadventure.helper.SPHelper.clearUser(this);
                openActivity(ya.haojun.roadtoadventure.activity.PermissionActivity.class);
                finish();
            }else {
                rv_drawer.getAdapter().notifyItemChanged(0);
            }
            break;
    }
}