@java.lang.Override
public void run() {
    com.example.alv_chi.improject.greendao.DataBaseUtil.getDataBaseInstance().create(new com.example.alv_chi.improject.greendao.MessageRecord(null, baseItem.getUserName(), dataManagerInstance.getCurrentMasterUserName(), baseItem.getCurrentTimeStamp(), baseItem.getMesage(), baseItem.getCurrentTimeStamp(), baseItem.getMesage(), baseItem.getUserJID(), baseItem.getTypeView(), baseItem.isReceivedMessage(), baseItem.isOnline()));
    android.util.Log.e(com.example.alv_chi.improject.service.XmppListenerService.TAG, "createRecentChatRecord run: 插入消息记录线程完成执行");
}