private void deletePage(int pageIndex) {
    for (roottemplate.calculator.data.KeyboardKits.KitVersion kv : mCurrentKitV.mParent.mKitVersions) {
        roottemplate.calculator.data.KeyboardKits[] pages = kv.mPages;
        kv.mPages = roottemplate.calculator.util.Util.removeFromObjectArray(pages, pageIndex, new roottemplate.calculator.data.KeyboardKits.Page[(pages.length) - 1]);
        if ((kv.mMainPageIndex) > pageIndex)
            (kv.mMainPageIndex)--;
        
    }
    mKitPreviewAdapter.notifyDataSetChanged();
}