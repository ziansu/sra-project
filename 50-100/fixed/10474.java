public static void setTotals() {
    if ((com.tanghe.garben.capitalbooze.OrderFragment.totalPrice) > 0.0) {
        com.tanghe.garben.capitalbooze.OrderFragment.mTotalPrice.setText(java.lang.String.format(java.util.Locale.getDefault(), "€%.2f", com.tanghe.garben.capitalbooze.OrderFragment.totalPrice));
    }else {
        com.tanghe.garben.capitalbooze.OrderFragment.totalPrice = 0.0;
        com.tanghe.garben.capitalbooze.OrderFragment.mTotalPrice.setText(java.lang.String.format(java.util.Locale.getDefault(), "€%.2f", com.tanghe.garben.capitalbooze.OrderFragment.totalPrice));
    }
    com.tanghe.garben.capitalbooze.OrderFragment.mTotalSquares.setText(java.lang.String.format(java.util.Locale.getDefault(), "#%1d", com.tanghe.garben.capitalbooze.OrderFragment.totalSquares));
    com.tanghe.garben.capitalbooze.OrderFragment.mTotalCount.setText(java.lang.String.format(java.util.Locale.getDefault(), "%1d", com.tanghe.garben.capitalbooze.OrderFragment.totalCount));
}