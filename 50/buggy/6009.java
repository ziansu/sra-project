@java.lang.Override
protected void restoreUiState(@android.support.annotation.NonNull
android.os.Bundle savedInstanceState) {
    super.restoreUiState(savedInstanceState);
    progressLoading.setVisibility((savedInstanceState.getBoolean("progressLoadingVisible") ? android.view.View.VISIBLE : android.view.View.INVISIBLE));
    btnLoad.setEnabled(savedInstanceState.getBoolean("btnLoadEnabled"));
}