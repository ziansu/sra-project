@org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
public void onLogoutEvent(tech.msociety.terawhere.events.LogoutEvent event) {
    if (requireAuth) {
        finish();
    }
}