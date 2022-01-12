public void stop(android.view.View view) {
    if ((mySound) != null) {
        mySound.release();
        mySound = null;
    }
}