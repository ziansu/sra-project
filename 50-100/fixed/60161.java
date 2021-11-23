@java.lang.Override
public void onPause() {
    this.backgroundMusic.stop();
    this.backgroundMusic.dispose();
    this.backgroundMusic = null;
    this.stage.dispose();
    this.stage = null;
    this.uiSkin.dispose();
    this.uiSkin = null;
}