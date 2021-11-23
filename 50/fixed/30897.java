@java.lang.Override
public void clearModifications() {
    modifiedBeans.clear();
    transientBeans.clear();
    validationCache.setDirty();
}