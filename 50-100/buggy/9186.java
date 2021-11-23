private void notifyStateChanged() {
    if ((mListener) != null) {
        if ((android.os.Looper.getMainLooper()) != (android.os.Looper.myLooper())) {
            mHandler.post(() -> mListener.onResidentOperationStateChanged());
        }else {
            mListener.onResidentOperationStateChanged();
        }
    }
}