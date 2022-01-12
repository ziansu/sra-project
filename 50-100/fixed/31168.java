@java.lang.Override
public void onChecked(java.lang.Integer result) {
    int ver = mSettings.getInt("version", 0);
    if ((result != null) && (result > ver)) {
        startService(mService);
        mEditorSettings.putInt("version", result);
        mEditorSettings.commit();
    }else {
        mSwipeRefreshLayout.setRefreshing(false);
        mProgressBar.setVisibility(View.GONE);
        android.widget.Toast.makeText(getApplicationContext(), "Нема нови податоци", Toast.LENGTH_SHORT).show();
    }
}