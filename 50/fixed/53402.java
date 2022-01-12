@java.lang.Override
public void onDestroyView() {
    saveSession(true);
    stepAttemptPresenter.detachView(this);
    super.onDestroyView();
}