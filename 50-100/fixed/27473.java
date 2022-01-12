private void reloadCollection() {
    moomintrollsCollection.clear();
    int rows = moomintrollsDataModel.getRowCount();
    for (int i = 0; i < rows; i++) {
        moomintrollsCollection.add(moomintrollsDataModel.getRow(i));
    }
}