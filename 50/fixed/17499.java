@java.lang.Override
protected void elementClicked(int index, boolean doubleClick) {
    if (doubleClick)
        rootElement.getElement(index).invertOpened();
    else {
        rootElement.getElement(index).openList();
        this.selectedIndex = index;
    }
}