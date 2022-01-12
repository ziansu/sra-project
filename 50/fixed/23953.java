@java.lang.Override
public void onClick(android.view.View v) {
    onRefresh();
    if (!(com.calgen.stockhawk.utils.BasicUtils.isNetworkUp(this))) {
        showInternetOffSnackBar();
    }
}