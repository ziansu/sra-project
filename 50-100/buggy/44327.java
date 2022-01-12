@java.lang.Override
public void onMatrixError(org.matrix.androidsdk.rest.model.MatrixError e) {
    org.matrix.androidsdk.util.Log.d(org.matrix.androidsdk.data.EventTimeline.LOG_TAG, "backPaginate onMatrixError");
    if (MatrixError.UNKNOWN.equals(e.errcode)) {
        mCanBackPaginate = false;
    }
    mIsBackPaginating = false;
    if (null != (callback)) {
        callback.onMatrixError(e);
    }else {
        super.onMatrixError(e);
    }
}