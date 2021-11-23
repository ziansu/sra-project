public void onPause() {
    super.onPause();
    com.umeng.analytics.MobclickAgent.onPause(this);
}