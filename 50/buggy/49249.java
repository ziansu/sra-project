@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    renderer3D.gameEngine.pause(false);
    com.apps.philipps.opengltest.Backend.life = 3;
    com.apps.philipps.opengltest.Backend.score = 0;
    java.lang.System.gc();
}