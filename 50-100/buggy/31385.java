@java.lang.Override
public void onNext(android.util.Pair<com.recoverrelax.pt.riotxmppchat.Network.Helper.FriendMessageListImpl.Method, java.util.List<com.recoverrelax.pt.riotxmppchat.Riot.Model.FriendListChat>> pair) {
    if (pair.first.isReturnAll()) {
        com.recoverrelax.pt.riotxmppchat.MainApplication.getInstance().getBusInstance().post(new com.recoverrelax.pt.riotxmppchat.EventHandling.MessageList.OnMessageListReceivedEvent(pair.second));
    }else
        if (pair.first.isReturnSingle()) {
            android.util.Log.i("ASAS2", "HERE");
            com.recoverrelax.pt.riotxmppchat.MainApplication.getInstance().getBusInstance().post(new com.recoverrelax.pt.riotxmppchat.EventHandling.MessageList.OnMessageSingleItemReceivedEvent(pair.second.get(0)));
        }
    
}