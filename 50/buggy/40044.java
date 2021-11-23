@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    this.poster = null;
    this.playButton = null;
    this.video = null;
    java.lang.Runtime.getRuntime().gc();
}