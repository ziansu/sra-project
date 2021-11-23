@java.lang.Override
protected void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    if ((intent.getData()) == null) {
        return ;
    }
    if ((_vpnService.getStatus()) != (VPNService.VPNStatus.DISCONNECTED)) {
        android.widget.Toast.makeText(this, R.string.already_connected_please_disconnect, Toast.LENGTH_LONG).show();
        return ;
    }
    try {
        _connectionService.parseCallbackIntent(intent);
        openFragment(new net.tuxed.vpnconfigimporter.fragment.ConnectProfileFragment());
    } catch (net.tuxed.vpnconfigimporter.service.ConnectionService ex) {
        ex.printStackTrace();
    }
}