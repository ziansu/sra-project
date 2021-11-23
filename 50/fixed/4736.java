@java.lang.Override
public void onBackPressed() {
    if ((mySound) != null) {
        mySound.release();
        mySound = null;
    }
    this.finish();
    super.onBackPressed();
}