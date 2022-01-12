private void notifyBlockEvent(long endTime, long startTime) {
    android.support.v4.content.LocalBroadcastManager manager = android.support.v4.content.LocalBroadcastManager.getInstance(mContext);
    android.content.Intent intent = new android.content.Intent();
    if (isANR(endTime)) {
        intent.setAction(qiniu.predem.android.block.BlockPrinter.ACTION_ANR);
    }else {
        intent.setAction(qiniu.predem.android.block.BlockPrinter.ACTION_BLOCK);
    }
    intent.putExtra(qiniu.predem.android.block.BlockPrinter.EXTRA_START_TIME, startTime);
    intent.putExtra(qiniu.predem.android.block.BlockPrinter.EXTRA_FINISH_TIME, endTime);
    manager.sendBroadcast(intent);
}