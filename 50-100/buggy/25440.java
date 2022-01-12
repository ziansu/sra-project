public void finishAllActivity() {
    if ((cn.kellygod.schoolclient.util.AppManager.activityStack) != null) {
        for (int i = 0, size = cn.kellygod.schoolclient.util.AppManager.activityStack.size(); i < size; i++) {
            if (null != (cn.kellygod.schoolclient.util.AppManager.activityStack.get(i)))
                cn.kellygod.schoolclient.util.AppManager.activityStack.get(i).finish();
            
        }
        cn.kellygod.schoolclient.util.AppManager.activityStack.clear();
    }
    java.lang.System.exit(0);
}