private void exitByDoubleClick() {
    java.util.Timer tExit;
    if (!(com.buoyantec.iGrid.ui.activity.MainActivity.isExit)) {
        com.buoyantec.iGrid.ui.activity.MainActivity.isExit = true;
        android.widget.Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
        tExit = new java.util.Timer();
        tExit.schedule(new java.util.TimerTask() {
            @java.lang.Override
            public void run() {
                com.buoyantec.iGrid.ui.activity.MainActivity.isExit = false;
            }
        }, 2000);
    }else {
        java.lang.System.exit(0);
    }
}