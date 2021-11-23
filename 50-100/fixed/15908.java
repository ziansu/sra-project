private void hideFragment() {
    if ((mListener) != null) {
        mListener.onFragmentHidden();
    }
    if ((mAttachView) != null) {
        android.support.v4.app.Fragment activeFragment = mContext.getSupportFragmentManager().findFragmentById(mAttachView.getId());
        if (activeFragment != null) {
            mContext.getSupportFragmentManager().beginTransaction().remove(activeFragment).commit();
        }
        mAttachView.setVisibility(View.GONE);
    }
}