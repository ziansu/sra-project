private void updateNotifyMenu(boolean flag) {
    if ((menu) == null)
        return ;
    
    if ((cn.edu.jxnu.awesome_campus.MainActivity.presenter.getCurrentSelectedID()) == (DrawerItem.HOME.getId())) {
        menu.clear();
        if (flag) {
            getMenuInflater().inflate(R.menu.menu_notify_unread, menu);
        }else {
            getMenuInflater().inflate(R.menu.menu_notify_none, menu);
        }
    }
}