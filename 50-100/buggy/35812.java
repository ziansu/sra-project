public void run() {
    mProgressDialog.dismiss();
    if (value >= 0) {
        mToast.makeText(getActivity(), java.lang.String.format("Optimization done!"), mToast.LENGTH_SHORT).show();
    }else
        if (value < 0) {
            mToast.makeText(getActivity(), java.lang.String.format("Optimization failed!"), mToast.LENGTH_SHORT).show();
        }
    
    updateState(com.introlab.rtabmap.RTABMapActivity.State.STATE_IDLE);
}