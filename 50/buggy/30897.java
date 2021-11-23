@java.lang.Override
public void clearModifications() {
    modifiedBeans.clear();
    transientBeans.clear();
    validationDirtyBeans.clear();
    validationCache.setDirty();
}