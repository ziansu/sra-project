private void forwardMessages(java.util.ArrayList<org.telegram.android.MessageObject> arrayList, boolean fromMyName) {
    if ((arrayList == null) || (arrayList.isEmpty())) {
        return ;
    }
    if (!fromMyName) {
        org.telegram.android.SendMessagesHelper.getInstance().sendMessage(arrayList, dialog_id);
    }else {
        for (org.telegram.android.MessageObject object : arrayList) {
            org.telegram.android.SendMessagesHelper.getInstance().processForwardFromMyName(object, dialog_id);
        }
    }
}