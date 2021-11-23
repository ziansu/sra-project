@android.support.annotation.MainThread
private void changeChannelsFavoriteFlag(rss.feed.reader.api.model.Channel newChannel) {
    for (rss.feed.reader.api.model.Channel channel : mChannelsList) {
        if (channel.getId().equals(newChannel.getId())) {
            channel.setFavorite(newChannel.isFavorite());
            break;
        }
    }
    mLocalStorage.storeChannels(mChannelsList);
    if (mRemoteStorage.isConnected()) {
        mRemoteStorage.editChannel(newChannel, newChannel);
    }
}