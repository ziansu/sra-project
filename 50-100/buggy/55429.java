@java.lang.Override
public void onResume() {
    super.onResume();
    android.util.Log.d(TAG, "onResume");
    loginView();
    if (((mtvFlow) != null) && (isLogin)) {
        currentAccount = com.etoc.weflow.WeFlowApplication.getAppInstance().getAccountInfo();
        mtvFlow.showNumberWithAnimation(currentAccount.getFlowcoins(), 1000);
    }
}