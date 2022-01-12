public void run() {
    cn.waynechu.mobilesafe.chapter04.entity.AppInfo mappInfo = ((cn.waynechu.mobilesafe.chapter04.entity.AppInfo) (adapter.getItem(position)));
    if (mappInfo != null) {
        boolean flag = mappInfo.isSelected;
        for (cn.waynechu.mobilesafe.chapter04.entity.AppInfo appInfo : userAppInfos) {
            appInfo.isSelected = false;
        }
        for (cn.waynechu.mobilesafe.chapter04.entity.AppInfo appInfo : systemAppInfos) {
            appInfo.isSelected = false;
        }
        if (flag) {
            mappInfo.isSelected = false;
        }else {
            mappInfo.isSelected = true;
        }
        mHandler.sendEmptyMessage(15);
    }
}