public void skip(android.view.View v) {
    if (!(whichTimer.matches("ready"))) {
        int timeToFinish = java.lang.Integer.parseInt(timeTextView.getText().toString());
        timeLeft = (java.lang.Math.round(((timeLeft) / 1000.0F))) - timeToFinish;
        timeLeft *= 1000;
    }
    whichTimer().cancel();
    whichTimer().onFinish();
    if (pause) {
        whichTimer().cancel();
        resumeTimer.cancel();
    }
}