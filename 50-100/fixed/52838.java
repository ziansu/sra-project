private boolean isSelectedRecursively(augsburg.se.alltagsguide.common.Page item, int mCurrentPageId) {
    augsburg.se.alltagsguide.common.Page curPage = item;
    while (curPage != null) {
        if (augsburg.se.alltagsguide.utilities.Objects.equals(curPage.getId(), mCurrentPageId)) {
            return true;
        }
        curPage = curPage.getParent();
    } 
    return false;
}