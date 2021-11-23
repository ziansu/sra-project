@java.lang.Override
public void onSuccess() {
    mShouldSendTwoStepSMS = false;
    if ((isJetpackAuth()) && ((getActivity()) != null)) {
        getActivity().setResult(Activity.RESULT_OK);
        getActivity().finish();
        return ;
    }
    org.wordpress.android.ui.accounts.helpers.FetchBlogListWPCom fetchBlogListWPCom = new org.wordpress.android.ui.accounts.helpers.FetchBlogListWPCom();
    fetchBlogListWPCom.execute(mFetchBlogListCallback);
}