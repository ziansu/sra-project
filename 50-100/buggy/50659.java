@java.lang.Override
public void onActionSuccess(int action, @android.support.annotation.Nullable
com.tomeokin.lspush.data.model.BaseResponse response) {
    if (action == (com.tomeokin.lspush.biz.common.UserScene.ACTION_GET_ACCESS_RESPONSE)) {
        com.tomeokin.lspush.data.model.AccessResponse accessResponse = ((com.tomeokin.lspush.data.model.AccessResponse) (response));
        setTheme(R.style.AppTheme);
        if (accessResponse != null) {
            com.tomeokin.lspush.common.Navigator.moveTo(this, com.tomeokin.lspush.biz.home.HomeFragment.class, null);
        }else {
            android.content.Intent intent = new android.content.Intent(this, com.tomeokin.lspush.biz.auth.AuthActivity.class);
            startActivity(intent);
            finish();
        }
    }
}