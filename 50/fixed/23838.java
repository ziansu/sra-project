@java.lang.Override
public void notifyUI(java.util.List data) {
    mConversation = ((com.example.pma_tim10.chatapp.model.Conversation) (data.get(0)));
    setTitle(mConversation.getName().replace(currentUser.getDisplayName(), ""));
}