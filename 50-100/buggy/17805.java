@java.lang.Override
public void call(com.facebook.Session session, com.facebook.SessionState state, java.lang.Exception exception) {
    mPreLoginActivity.dismissProgressDialog();
    if (session.isOpened()) {
        mPreLoginActivity.showProgressDialog();
        return ;
    }
    fetchUserInfoFromFB(session);
    if ((session.getState()) == (com.facebook.SessionState.CLOSED_LOGIN_FAILED)) {
        webservices.jibin.com.webservicesstudy.customview.FaceBookHelper.fbSessionClearClose();
    }
}