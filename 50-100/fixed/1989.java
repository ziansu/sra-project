@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    btnInstall.setVisibility(View.INVISIBLE);
    android.widget.Toast.makeText(getActivity(), getString(R.string.toast_grant_install), Toast.LENGTH_SHORT).show();
    tvProgress.setText(getString(R.string.tv_done));
    proviewInstall.setVisibility(View.INVISIBLE);
}