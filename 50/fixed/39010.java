private co.gounplugged.unpluggeddroid.models.Conversation getLastConversation() {
    if (null == (getActivity()))
        return null;
    
    return ((co.gounplugged.unpluggeddroid.activities.ChatActivity) (getActivity())).getLastSelectedConversation();
}