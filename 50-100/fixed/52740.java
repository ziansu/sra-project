public java.util.ArrayList<java.lang.String> getDataRow(int rowId) {
    if ((dataList.size()) >= rowId) {
        return dataList.get((rowId - 1)).stringList;
    }
    android.util.Log.d("adapter", "no row found");
    return null;
}