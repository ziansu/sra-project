public void clear() {
    mProcedureDefinitions.clear();
    mProcedureReferences.clear();
    mProcedureNameManager.clear();
    mCountOfReferencesWithReturn = 0;
    int obsCount = mObservers.size();
    for (int i = 0; i < obsCount; ++i) {
        mObservers.get(i).onClear();
    }
}