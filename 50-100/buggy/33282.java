private void load(com.sciaps.common.data.Standard standard) throws java.lang.Exception {
    if (((standard.mId) != null) && (!(mLoadedStandards.contains(standard.mId)))) {
        java.util.Collection<java.lang.String> retval = mApiHandler.getTestsForStandard(standard.mId);
        for (java.lang.String testId : retval) {
            com.sciaps.common.data.LIBZTest test = mObjLoader.deepLoad(com.sciaps.common.data.LIBZTest.class, testId);
            mTestsOfStandard.insert(test);
        }
        mLoadedStandards.add(standard.mId);
    }
}