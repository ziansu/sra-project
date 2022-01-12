@java.lang.Override
public void onTradeNotification(com.android.futures.entity.TradeEntity entity) {
    mTradeSequence.add(0, entity);
    android.os.Message msg = android.os.Message.obtain();
    msg.what = TraderStatusListener.TradeNotification;
    msg.obj = entity;
    mHandler.sendMessage(msg);
}