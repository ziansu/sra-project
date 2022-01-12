@java.lang.Override
public void onItemClick(android.view.View view, int position, final com.jeromyang.transmssion.model.OnlineModel onlineModel) {
    android.widget.Toast.makeText(App.context, ("发送消息 desIp=" + (onlineModel.getSourceIp())), Toast.LENGTH_SHORT).show();
    com.jeromyang.transmssion.SendOperation.getInstance().sendMessage(com.jeromyang.transmssion.model.MessageModel.createMessage(MessageModel.SEND_INFO, onlineModel.getSourceIp(), new com.jeromyang.transmssion.model.SendInfo().getJsonString()), 10);
}