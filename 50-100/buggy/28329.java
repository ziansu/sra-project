@java.lang.Override
public boolean onLongClick(android.view.View v) {
    switch (groupTag) {
        case net.bither.adapter.hot.HotAddressFragmentListAdapter.PrivateGroupTag :
            new net.bither.ui.base.dialog.DialogAddressWithShowPrivateKey(activity, privates.get(position)).show();
        case net.bither.adapter.hot.HotAddressFragmentListAdapter.WatchOnlyGroupTag :
            new net.bither.ui.base.dialog.DialogAddressWatchOnlyLongClick(activity, watchOnlys.get(position)).show();
        case net.bither.adapter.hot.HotAddressFragmentListAdapter.HDMGroupTag :
    }
    return true;
}