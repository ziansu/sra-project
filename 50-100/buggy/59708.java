@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    switch (intent.getAction()) {
        case org.dcxz.designdigger.activity.LoginActivity.TAG :
            doPullToRefresh();
            break;
        case MenuFragment.TAG :
            org.dcxz.designdigger.app.App.getQueue().cancelAll(((org.dcxz.designdigger.fragment.MainFragment.TAG) + (subTag)));
            isUserLogined();
            break;
    }
}