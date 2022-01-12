@java.lang.Override
public void setUserVisibleHint(boolean isVisibleToUser) {
    super.setUserVisibleHint(isVisibleToUser);
    if (isVisibleToUser) {
        if ((getContext()) != null) {
            loading = new android.app.ProgressDialog(getContext());
            loading.setCancelable(true);
            loading.setMessage("FETCHING DATA");
            loading.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            loading.show();
            android.util.Log.i("VISIBLE", "REFRESHING");
            makeNetworkCall();
        }
    }else {
        android.util.Log.i("VISIBLE", "NO");
    }
}