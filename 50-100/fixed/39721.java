public void callback(java.lang.String result) {
    try {
        ch.epfl.dedis.net.UpdateChain uc = ch.epfl.dedis.crypto.Utils.fromJson(result, ch.epfl.dedis.net.UpdateChain.class);
        boolean verified = uc.verifySkipChain();
        if (verified) {
            mActivity.taskJoin();
        }else {
            mActivity.taskFail(R.string.info_noverification);
        }
    } catch (java.lang.Exception e) {
        mActivity.taskFail(R.string.info_corruptedjson);
    }
}