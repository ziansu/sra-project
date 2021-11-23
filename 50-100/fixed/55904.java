public void run() {
    position = 0;
    java.util.ArrayList<com.leowong.extendedrecyclerview.models.ViewItem> data = new java.util.ArrayList<>();
    for (int i = 0; i < (mAdapter.getPageCount()); i++) {
        data.add(new com.leowong.extendedrecyclerview.models.ViewItem(0, ("refresh str" + ((position)++))));
    }
    mAdapter.replaceAll(data);
}