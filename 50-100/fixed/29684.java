private boolean chatHasChannel(java.lang.String username, com.skyperobit.model.ChatModel chat) {
    java.util.Set<com.skyperobit.model.YouTubeChannelModel> channels = chat.getYoutubeChannels();
    if (channels != null) {
        for (com.skyperobit.model.YouTubeChannelModel channel : channels) {
            if ((channel.getUsername().equals(username)) || (channel.getId().equals(username))) {
                return true;
            }
        }
    }
    return false;
}