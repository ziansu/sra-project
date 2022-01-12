com.study.hancom.sharephototest.model.PageLayout getPageLayout(int elementNum) throws java.lang.Exception {
    com.study.hancom.sharephototest.model.PageLayout pageLayout = null;
    java.util.List<com.study.hancom.sharephototest.model.PageLayout> pageLayoutList = mLayoutMap.get(elementNum);
    if (pageLayoutList == null) {
        pageLayoutList = findLayoutFile(elementNum);
        mLayoutMap.put(elementNum, pageLayoutList);
    }
    if ((pageLayoutList.size()) > 0) {
        pageLayout = pageLayoutList.get(com.study.hancom.sharephototest.util.MathUtil.getRandomMath(pageLayoutList.size(), 0));
    }
    return pageLayout;
}