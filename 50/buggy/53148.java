@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    com.kevin.rxbus.RxBus.getDefault().removeSticky(com.kevin.rxbus.samples.User.class);
}