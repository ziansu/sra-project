@java.lang.Override
public void handleMessage(android.os.Message msg) {
    if (3 == (msg.what)) {
        logList.add(((im.color.logwithdatabases.db.LogBean) (msg.obj)));
        if ((logList.size()) > 5000) {
            sendEmptyMessage(1);
        }else {
            sendEmptyMessageDelayed(1, 1000);
        }
    }else
        if (1 == (msg.what)) {
            insertDb();
        }
    
}