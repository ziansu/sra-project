@java.lang.Override
public void onClick(android.view.View v) {
    mCallback.startVector(mContext, mimetype, vectorData, vectorName);
    mCallback.sendToFirebase(mContext.getResources().getString(R.string.event_start), mContext.getResources().getString(R.string.item_vector), null, vectorName);
}