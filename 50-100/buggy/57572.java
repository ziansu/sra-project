public void updateProgressDialog(long progress) {
    if (progress == 100) {
        progressDialog.setProgress(progressDialog.getMax());
        setResult(org.catrobat.catroid.ui.RESULT_OK, resultIntent);
        progressDialog.dismiss();
        finish();
    }else {
        progressDialog.setProgress(((int) (progress)));
    }
}