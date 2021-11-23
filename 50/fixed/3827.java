@java.lang.Override
public int getNumRetry() {
    if ((mContext) != null) {
        return mContext.getResources().getInteger(R.integer.ox_permission_retries_camera);
    }else {
        return 0;
    }
}