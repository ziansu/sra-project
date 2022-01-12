public void onPageBreak(boolean isHorizontalPageBreak, boolean isFixedlayoutPageBreak) {
    if (!isHorizontalPageBreak) {
        pageRowCount = 0;
        if (addAfterBreak) {
            next();
            addAfterBreak = false;
        }else {
            if (isFixedlayoutPageBreak) {
                next();
            }
            if (softBreakBefore) {
                softBreakBefore = false;
            }
        }
    }
}