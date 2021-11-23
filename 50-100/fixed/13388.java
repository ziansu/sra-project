@java.lang.Override
public void success(java.lang.Object obj) {
    net.bither.utils.PeerUtil.startPeer();
    javax.swing.SwingUtilities.invokeLater(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            dialogProgress.dispose();
            net.bither.Bither.refreshFrame();
            net.bither.preference.UserPreference.getInstance().setVerionCode(BitherSetting.VERSION_CODE);
            net.bither.utils.PeerUtil.startPeer();
        }
    });
}