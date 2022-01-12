public void onClickPrev(android.view.View view) {
    if ((currPos) > 0) {
        (currPos)--;
        if ((currPos) < 0) {
            currPos = (dict.size()) - 1;
        }
        updateMemorizationView();
    }
}