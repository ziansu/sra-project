@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    com.apps.philipps.opengltest.Backend.life = 3;
    com.apps.philipps.opengltest.Backend.score = 0;
}