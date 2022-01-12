public void loadPrev(android.content.ContentValues values) {
    values.remove(RetrieveList.PAGE_NUMBER);
    values.put(RetrieveList.PAGE_NUMBER, ((currentPage) - 1));
}