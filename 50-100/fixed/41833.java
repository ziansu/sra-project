private void notifyHeaderScrollChanged(int changedHeight) {
    int scrollDistance = changedHeight - (heightOfHeader);
    if ((onHeaderScrollChangedListener) == null) {
        return ;
    }
    if (scrollDistance > 0) {
        onHeaderScrollChangedListener.headerScrollChanged(scrollDistance);
    }else {
        onHeaderScrollChangedListener.actionBarTranslate(scrollDistance);
    }
}