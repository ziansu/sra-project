public void registerChatActivity(com.playxiangqi.hoxchess.ChatBubbleActivity activity) {
    if (activity != null) {
        activity.setMessageListener(networkController_);
    }
}