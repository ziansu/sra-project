@java.lang.Override
public void onSuccess(org.json.JSONObject response) {
    com.lk.hotelcheck.bean.User user = new com.lk.hotelcheck.bean.User();
    user.setUserName(userId);
    com.lk.hotelcheck.manager.DataManager.getInstance().setUser(user);
    android.content.Intent intent = new android.content.Intent();
    intent.setClass(this, com.lk.hotelcheck.activity.main.MainActivity.class);
    startActivity(intent);
    finish();
    android.widget.Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
    mLoadingGroup.setVisibility(View.GONE);
}