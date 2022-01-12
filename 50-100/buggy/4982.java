public void run() {
    if (success) {
        handler.postDelayed(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                refresh();
                progressBar.setVisibility(View.GONE);
            }
        }, 1000);
    }else {
        java.lang.String s1 = getResources().getString(R.string.get_failed_please_check);
        android.widget.Toast.makeText(getActivity(), s1, 1).show();
        progressBar.setVisibility(View.GONE);
    }
}