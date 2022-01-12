@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    com.totoro.commons.utils.ToastUtil.recycle();
}