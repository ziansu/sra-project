public void appendAll(java.util.List<?> objects) {
    if (objects == null) {
        throw new java.lang.IllegalArgumentException("objects can not be null");
    }
    int prevSize = this.dataList.size();
    java.util.List<java.lang.Object> data = new java.util.ArrayList<>((prevSize + (dataList.size())));
    data.addAll(dataList);
    data.addAll(objects);
    dataList = data;
    notifyItemRangeInserted(prevSize, dataList.size());
}