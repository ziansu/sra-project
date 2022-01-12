public void restorePoint() {
    if ((recordsCount) > 0) {
        updateServe();
        decresePoint();
        checkIfDone();
        displayScore();
        calWinStraight();
    }else {
        speakToUser("There is no point to decrease");
        java.lang.System.out.println("There is no point to decrease");
    }
}