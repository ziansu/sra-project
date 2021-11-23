@java.lang.Override
public void searchFirendOrCircle(com.zdn.CommandParser.CommandE e) {
    android.os.Message msg = handler.obtainMessage();
    msg.what = com.zdn.logic.InternetComponent.ThreadTaskHandler.SEND_MESSAGE_TO_SERVER;
    e.GetProperty("URL").SetPropertyContext(com.zdn.logic.InternetComponent.WEBSITE_ADDRESS_ADD_A_FRIEND_ANSWER_REQ);
    msg.obj = e;
    handler.sendMessage(msg);
}