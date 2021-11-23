@java.lang.Override
public void execute(io.realm.Realm realm) {
    for (com.wwwsmschat.smschat.model.Message m : getMessagesList()) {
        if (m.isValid()) {
            m.setStatus(status);
            if ((m.getId()) == messageID) {
                m.setCreatedTime(com.wwwsmschat.smschat.util.DateUtil.getInstance().getCurrentTime());
                notifyDataSetChanged();
                break;
            }
        }
    }
}