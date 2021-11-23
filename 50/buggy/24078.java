@java.lang.Override
public void onClick(android.view.View v) {
    onRefresh();
    if (!(com.udacity.stockhawk.utils.BasicUtils.isNetworkUp(this))) {
        addStock(symbol);
    }
}