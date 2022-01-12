@java.lang.Override
public void onItemClick(android.view.View view, int position) {
    switch (position) {
        case 0 :
            site.yanhui.mobilesafe.utils.ToastUtils.showShort(this, "点击了手机防盗");
            showDialog();
            break;
        case 8 :
            android.content.Intent intent = new android.content.Intent(this, site.yanhui.mobilesafe.activity.SettingActivity.class);
            startActivity(intent);
            break;
        default :
            break;
    }
}