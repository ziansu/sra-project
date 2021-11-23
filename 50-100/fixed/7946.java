public void logOut(java.lang.String username, java.lang.String pwd) {
    final com.carlocation.comm.messaging.AuthMessage authMsg = new com.carlocation.comm.messaging.AuthMessage(username, pwd, AuthMessage.AuthMsgType.AUTH_LOGOUT_MSG);
    mNativeService.sendMessage(authMsg, new com.carlocation.comm.ResponseListener() {
        @java.lang.Override
        public void onResponse(com.carlocation.comm.messaging.Notification noti) {
            authMsg.onResponseHandler(noti);
        }
    });
}