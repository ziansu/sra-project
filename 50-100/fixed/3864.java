private com.afunx.xml.model.SoftApXmlModel getNextSoftap(com.afunx.service.Testcases testcases) {
    ++(mTotalCount);
    java.util.List<com.afunx.xml.model.SoftApXmlModel> softaps = testcases.getSelectedSoftaps();
    int size = testcases.getSelectedSoftaps().size();
    com.afunx.xml.model.SoftApXmlModel softap = softaps.get(mIndex4Next);
    switch (testcases.getTestMode()) {
        case 0 :
            mIndex4Next = (mTotalCount) / size;
            break;
        case 1 :
        default :
            mIndex4Next = (++(mIndex4Next)) % size;
            break;
    }
    return softap;
}