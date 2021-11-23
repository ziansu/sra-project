private void forwardMessages(java.util.ArrayList<org.telegram.android.MessageObject> arrayList, boolean fromMyName) {
    if ((arrayList == null) || (arrayList.isEmpty())) {
        return ;
    }
    for (org.telegram.android.MessageObject object : arrayList) {
        if (!fromMyName) {
            org.telegram.android.SendMessagesHelper.getInstance().sendMessage(object, dialog_id);
        }else {
            org.telegram.android.SendMessagesHelper.getInstance().processForwardFromMyName(object, dialog_id);
        }
    }
}