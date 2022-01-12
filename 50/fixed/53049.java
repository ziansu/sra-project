@java.lang.Override
public void searchFirendOrCircle(com.zdn.CommandParser.CommandE e) {
    android.os.Message msg = handler.obtainMessage();
    msg.what = com.zdn.logic.InternetComponent.ThreadTaskHandler.SEND_MESSAGE_TO_SERVER;
    msg.obj = e;
    handler.sendMessage(msg);
}