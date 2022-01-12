public void handleMessage(android.os.Message msg) {
    switch (msg.what) {
        case com.kremol.market4.MainActivity.INIT_PRODUCT_OK :
            java.util.List<com.kremol.market4.Entry> entryList = changeToEntryList(productList);
            entryLists = classifyEntry(entryList);
            entryList = entryLists.get(typeNow);
            entryAdapter = new com.kremol.market4.EntryAdapter(this, R.layout.entry, entryList);
            listView.setAdapter(entryAdapter);
            break;
        default :
            break;
    }
}