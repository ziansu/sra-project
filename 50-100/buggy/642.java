@java.lang.Override
public void execute(io.realm.Realm realm) {
    for (com.wwwsmschat.smschat.model.Message m : getMessagesList()) {
        if ((m.getId()) == messageID) {
            if (m.isValid()) {
                m.setStatus(status);
                m.setCreatedTime(com.wwwsmschat.smschat.util.DateUtil.getInstance().getCurrentTime());
                notifyDataSetChanged();
                break;
            }
        }
    }
}