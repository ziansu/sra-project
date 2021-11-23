private void onSelectedResource(int index) {
    if (index != (-1)) {
        updateCurrentResource();
    }
    currentResourceIndex = index;
    mCurrentConnectionTypeIndex = 0;
    updateResourceTable();
}