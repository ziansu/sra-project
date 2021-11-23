@java.lang.Override
public void onItemClick(android.view.View view, int position) {
    switch (position) {
        case 0 :
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