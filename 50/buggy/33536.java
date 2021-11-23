public void onStop() {
    super.onStop();
    if (mBound) {
        this.getActivity().unbindService(mConnection);
        mBound = false;
    }
}