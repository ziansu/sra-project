@java.lang.Override
public void onShow() {
    android.util.Log.d(TAG, "onShow IN!");
    if (((mtvFlow) != null) && (isLogin)) {
        currentAccount = com.etoc.weflow.WeFlowApplication.getAppInstance().getAccountInfo();
        mtvFlow.showNumberWithAnimation(currentAccount.getFlowcoins(), 1000);
    }
    loginView();
}