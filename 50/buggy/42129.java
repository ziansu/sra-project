public void showProgress() {
    com.example.simplecropviewsample.ProgressDialogFragment f = com.example.simplecropviewsample.ProgressDialogFragment.getInstance();
    getFragmentManager().beginTransaction().add(f, com.example.simplecropviewsample.MainFragment.PROGRESS_DIALOG).addToBackStack(null).commit();
}