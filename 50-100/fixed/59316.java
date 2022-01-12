@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (!(com.calgen.stockhawk.utils.BasicUtils.isNetworkUp(context))) {
        showInternetOffSnackBar();
    }else {
        swipeRefreshLayout.setRefreshing(true);
        if ((snackbar) != null)
            snackbar.dismiss();
        
        updateEmptyView();
    }
}