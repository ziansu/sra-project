@java.lang.Override
protected void onPause() {
    super.onPause();
    for (int i = 0; i < (com.bootsysoftware.golfscorecard.controller.MainActivity.mHoles.length); i++) {
        mEditor.putInt(((com.bootsysoftware.golfscorecard.controller.MainActivity.KEY_STROKECOUNT) + i), com.bootsysoftware.golfscorecard.controller.MainActivity.mHoles[i].getNumStrokes());
    }
    mEditor.commit();
}