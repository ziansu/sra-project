private void notifyStateChanged() {
    if ((mListener) != null) {
        if ((android.os.Looper.getMainLooper()) != (android.os.Looper.myLooper())) {
            mHandler.post(() -> {
                synchronized(this) {
                    if ((mListener) != null) {
                        mListener.onResidentOperationStateChanged();
                    }
                }
            });
        }else {
            mListener.onResidentOperationStateChanged();
        }
    }
}