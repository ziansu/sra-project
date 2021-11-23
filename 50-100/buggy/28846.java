@java.lang.Override
public void onClick(android.view.View view) {
    drawerLayout.closeDrawers();
    android.content.Intent intent = new android.content.Intent(this, me.wcy.music.activity.ProfileAcitivity.class);
    intent.putExtra("name", username);
    if ((me.wcy.music.application.MusicApplication.getLoginState()) == 0) {
        me.wcy.music.utils.ToastUtils.show("请先登录");
    }
    if ((avatar) == (-1)) {
        avatar = 0;
    }
    intent.putExtra("avatar", avatar);
    startActivityForResult(intent, me.wcy.music.activity.MusicActivity.REQUEST_CODE_PROFILE);
}