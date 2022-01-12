@java.lang.Override
public void onTransferComplete(pro.dbro.airshare.app.OutgoingTransfer transfer, pro.dbro.airshare.session.Peer recipient, java.lang.Exception exception) {
    callback.onDataSent(new java.util.HashMap(transfer.getHeaderExtras()), transfer.getBodyBytes(), recipient);
    if ((mode) == (pro.dbro.airshare.app.ui.PeerFragment.Mode.SEND))
        callback.onFinished(null);
    
}