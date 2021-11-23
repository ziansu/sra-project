protected void channelLeave() {
    if (((mUsers) != null) && ((mUsers.size()) > 2)) {
        mChannelCore.channelLeave(new io.xpush.chat.core.CallbackEvent() {
            @java.lang.Override
            public void call(java.lang.Object... args) {
                leave();
            }
        });
    }else {
        leave();
    }
}