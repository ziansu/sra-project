@java.lang.Override
public void onUnexpectedError(java.lang.Exception e) {
    org.matrix.androidsdk.util.Log.d(im.vector.activity.VectorMemberDetailsActivity.LOG_TAG, ("## mCreateDirectMessageCallBack: onUnexpectedError Msg=" + (e.getLocalizedMessage())));
    if (null != (mRoomActionsListener)) {
        mRoomActionsListener.onUnexpectedError(e);
    }
}