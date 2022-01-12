private void notifyHeaderScrollChanged(int changedHeight) {
    int scrollDistance = changedHeight - (heightOfHeader);
    if (scrollDistance > 0) {
        if ((this.onHeaderScrollChangedListener) != null) {
            onHeaderScrollChangedListener.headerScrollChanged(scrollDistance);
        }
    }else {
        if (scrollDistance <= ((heightOfActionBar) - (heightOfHeader))) {
            scrollDistance = (heightOfActionBar) - (heightOfHeader);
        }
        if ((this.onHeaderScrollChangedListener) != null) {
            onHeaderScrollChangedListener.actionBarTranslate(scrollDistance);
        }
    }
}