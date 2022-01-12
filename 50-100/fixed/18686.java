public void setData(final java.util.List<com.mogsev.util.Finance> data) {
    android.util.Log.d(com.mogsev.util.FinanceAdapter.TAG, "setData start");
    this.clear();
    if (data != null) {
        financesList = data;
        this.addAll(data);
        android.util.Log.d(com.mogsev.util.FinanceAdapter.TAG, (" " + (data.size())));
        android.util.Log.d(com.mogsev.util.FinanceAdapter.TAG, (" " + (data.toString())));
        android.util.Log.d(com.mogsev.util.FinanceAdapter.TAG, "setData end");
    }
}