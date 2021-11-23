public java.util.ArrayList<java.lang.String> getDataRow(int rowId) {
    if ((dataList.size()) >= (rowId + 1)) {
        return dataList.get(rowId).stringList;
    }
    android.util.Log.d("adapter", "no row found");
    return null;
}