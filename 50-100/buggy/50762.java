private void updateAdapterData() {
    int size = getCount();
    minRotation = 0.0F;
    maxRotation = (size == 0) ? 0.0F : 180.0F * (size - 1);
    freeAllLayouts();
    recycledViews.clear();
    viewsTypesMap.clear();
    setFoldRotation(foldRotation);
}