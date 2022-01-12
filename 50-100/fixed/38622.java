public void getpendingresult() {
    java.lang.System.out.println("Aaya123pending");
    new com.paulusworld.com.truckM.shipper.CompletedQueries.HttpAsyncTask().execute();
    if (!(connectionDetector.isConnectedToInternet())) {
        progressbar.setVisibility(View.INVISIBLE);
        retry.setVisibility(View.VISIBLE);
        confirmedsearchlist.setVisibility(View.INVISIBLE);
        retry.setOnClickListener(new android.view.View.OnClickListener() {
            @java.lang.Override
            public void onClick(android.view.View view) {
                retry.setVisibility(View.INVISIBLE);
                progressbar.setVisibility(View.VISIBLE);
                getpendingresult();
            }
        });
    }
}