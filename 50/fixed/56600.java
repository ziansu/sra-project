@java.lang.Override
protected void onRestart() {
    super.onRestart();
    doBindService();
    if ((measurementService) != null) {
        initGuiState();
    }
}