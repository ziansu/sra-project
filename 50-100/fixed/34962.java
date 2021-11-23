private void onRenderServerConfigSession(chat.rocket.android.model.internal.Session session) {
    if (session == null) {
        return ;
    }
    final java.lang.String token = session.getToken();
    if (!(chat.rocket.android.helper.TextUtils.isEmpty(token))) {
        if (chat.rocket.android.helper.TextUtils.isEmpty(session.getError())) {
            finish();
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        }else {
            showFragment(new chat.rocket.android.fragment.server_config.RetryLoginFragment());
        }
        return ;
    }
}