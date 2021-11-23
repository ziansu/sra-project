@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (!(com.calgen.stockhawk.utils.BasicUtils.isNetworkUp(context))) {
        showInternetOffSnackBar();
    }else {
        if ((snackbar) != null)
            snackbar.dismiss();
        
        updateEmptyView();
        swipeRefreshLayout.setRefreshing(true);
    }
}