protected void channelLeave() {
    if ((mUsers.size()) == 2) {
        leave();
    }else {
        mChannelCore.channelLeave(new io.xpush.chat.core.CallbackEvent() {
            @java.lang.Override
            public void call(java.lang.Object... args) {
                leave();
            }
        });
    }
}