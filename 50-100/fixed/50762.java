private void updateAdapterData() {
    int count = getCount();
    minRotation = 0.0F;
    maxRotation = (count == 0) ? 0.0F : 180.0F * (count - 1);
    freeAllLayouts();
    recycledViews.clear();
    viewsTypesMap.clear();
    setFoldRotation(foldRotation);
}