@java.lang.Override
protected void onPostExecute(java.util.ArrayList<java.lang.String> collections) {
    adapterCollections.clear();
    if ((adapterCollections) != null) {
        adapterCollections.addAll(collections);
    }
}