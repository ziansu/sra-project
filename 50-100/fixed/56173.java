@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (id) {
        case R.id.action_settings :
            android.widget.Toast.makeText(this, "暂未添加", Toast.LENGTH_SHORT).show();
            break;
        case R.id.action_updata :
            tk.imrhj.autologin.HttpContent.getResponse();
            break;
        case R.id.action_exit :
            android.content.Intent intent = new android.content.Intent(this, tk.imrhj.autologin.WifiChangeService.class);
            stopService(intent);
            java.lang.System.exit(0);
            break;
    }
    return super.onOptionsItemSelected(item);
}