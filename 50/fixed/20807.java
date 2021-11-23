@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle instanceState) {
    super.onSaveInstanceState(instanceState);
    saveViewData(instanceState);
    stopQuizTimerCount();
}