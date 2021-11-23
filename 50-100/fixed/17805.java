@java.lang.Override
public void call(com.facebook.Session session, com.facebook.SessionState state, java.lang.Exception exception) {
    mPreLoginActivity.dismissProgressDialog();
    if ((session.getState()) == (com.facebook.SessionState.CLOSED_LOGIN_FAILED)) {
        webservices.jibin.com.webservicesstudy.customview.FaceBookHelper.fbSessionClearClose();
    }
    if (session.isOpened()) {
        fetchUserInfoFromFB(session);
    }
    if ((session.getState()) == (com.facebook.SessionState.CLOSED_LOGIN_FAILED)) {
        webservices.jibin.com.webservicesstudy.customview.FaceBookHelper.fbSessionClearClose();
    }
}