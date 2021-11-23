@java.lang.Override
protected void onStop() {
    super.onStop();
    android.util.Log.i(cn.bit.hao.ble.tool.activity.BaseActivity.TAG, ((this.getClass().getSimpleName()) + " onStop"));
    cn.bit.hao.ble.tool.response.manager.CommonResponseManager.getInstance().unregisterUINotification(this);
}