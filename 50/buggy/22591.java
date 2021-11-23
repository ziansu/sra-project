@java.lang.Override
protected void onSaveInstanceState(final android.os.Bundle outState) {
    outState.putSerializable(com.company.mbelogorodtsev.trainingapplication.HomeActivity.SAVE_PROGRESS_DIALOG_PROGRESS, progressDialog.getProgress());
    super.onSaveInstanceState(outState);
}