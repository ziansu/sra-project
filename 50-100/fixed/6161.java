private void updateView(int setViewResult, boolean isreset) {
    if (((mManager) != null) && (setViewResult == 0)) {
        if ((mView.getParent()) != null) {
            if (isreset) {
                mManager.removeViewImmediate(mView);
                mManager.addView(mView, mParams);
            }else {
                mView.invalidate();
                mManager.updateViewLayout(mView, mParams);
            }
        }else {
            mManager.addView(mView, mParams);
        }
    }
}