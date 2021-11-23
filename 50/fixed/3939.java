@java.lang.Override
public void quizResultDialogConfirm() {
    presenter.playNextQuiz();
    isDialogShown = false;
    showAndroidKeyboard();
}