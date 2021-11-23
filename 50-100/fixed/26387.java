@java.lang.Override
public void queryCollection() {
    io.innofang.autosms.database.MessageManager manager = io.innofang.autosms.database.MessageManager.getInstance();
    java.util.List<io.innofang.autosms.bean.Message> messages = manager.getMessages();
    if (messages.isEmpty()) {
        mView.setEmptyViewState(true);
    }else {
        mView.setEmptyViewState(false);
        mView.showMessages(messages);
    }
}