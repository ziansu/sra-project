private void setIsLoading(final boolean loading) {
    if (isAdded()) {
        if ((progressBar) == null) {
            android.util.Log.w(LOG_TAG, ((line) + " progressBar is null."));
            return ;
        }
        getActivity().runOnUiThread(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                if (loading) {
                    progressBar.setVisibility(View.VISIBLE);
                }else {
                    progressBar.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}