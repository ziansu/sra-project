@java.lang.Override
protected void onPause() {
    super.onPause();
    active = false;
    com.github.kubatatami.judonetworking.stateful.StatefulCache.removeAllControllersCallbacks(getWho());
}