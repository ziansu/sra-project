public void onDestroy() {
    super.onDestroy();
    if ((count) == 0) {
        insertIntoDataBase(studyTimePassed);
    }
    studyTimer.cancel();
}