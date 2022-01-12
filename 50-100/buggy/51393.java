@java.lang.Override
public void run() {
    if (((java.lang.System.currentTimeMillis()) % 2) == 0) {
        paginate.onLoadingError();
        handler.postDelayed(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                loading = false;
            }
        }, 1000);
    }else {
        (page)++;
        adapter.add(com.example.paginate.data.DataProvider.getRandomData(itemsPerPage));
        loading = false;
    }
}