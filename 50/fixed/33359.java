public void resumeGame(android.view.View v) {
    finalproject.tap.PlayActivity.pausestatus = 0;
    finalproject.tap.PlayActivity.timerPaused = false;
    finalproject.tap.PlayActivity.timerResume = true;
    finish();
}