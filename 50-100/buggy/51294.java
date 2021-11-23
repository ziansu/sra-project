@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    if (isFinish) {
        finish();
    }else {
        isFinish = true;
        com.util.Tools.showToast(mContext, "�ٰ�һ�η��ؼ��˳�");
        mHandler.postDelayed(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                isFinish = false;
            }
        }, 2000);
    }
}