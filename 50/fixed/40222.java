public boolean storeWithId(android.content.Context context) {
    boolean wasStore;
    wasStore = insert(context, true);
    return wasStore;
}