public void run() {
    com.kakao.usermgmt.UserManagement.requestLogout(new com.kakao.usermgmt.callback.LogoutResponseCallback() {
        @java.lang.Override
        public void onCompleteLogout() {
            callbackContext.success();
        }
    });
}