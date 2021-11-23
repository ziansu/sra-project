@java.lang.Override
public void onDestroy() {
    view.unregisterBroadcastReceiver();
    butterknife.ButterKnife.unbind(view);
}