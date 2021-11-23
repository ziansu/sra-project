private void unRegister() {
    android.util.Log.e(com.mingle.autolist.AutoList.Tag, "unRegister Bus");
    com.mingle.utils.BusProvider.getInstance().unregister(this);
}