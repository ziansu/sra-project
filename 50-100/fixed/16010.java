@java.lang.Override
public void onNeighborConnected(com.ape.transfer.p2p.p2pentity.P2PNeighbor neighbor) {
    com.ape.transfer.util.Log.i(com.ape.transfer.activity.ApScanActivity.TAG, ("neighbor onNeighborConnected neighbor = " + (neighbor.ip)));
    android.content.Intent intent = new android.content.Intent(this, com.ape.transfer.activity.MainTransferActivity.class);
    intent.putExtra("neighbor", neighbor);
    startActivity(intent);
    finish();
}