private void setIsLoading(final boolean loading) {
    if (isAdded()) {
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