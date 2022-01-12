@java.lang.Override
public void onBackButtonClicked() {
    if ((screenIndex) == 0) {
    }else {
        view.showContestSubmissionPage((--(screenIndex)));
    }
}