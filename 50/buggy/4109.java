public void registerChatActivity(com.playxiangqi.hoxchess.ChatBubbleActivity activity) {
    networkController_.setChatActivity(activity);
    if (activity != null) {
        activity.setMessageListener(networkController_);
    }
}