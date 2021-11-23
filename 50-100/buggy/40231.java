public synchronized void toEnd() throws java.io.IOException {
    currentPage = getRoot();
    if ((getNumKeys()) != 0) {
        clearStack();
        currentIndex = currentPage.numKeys;
        if ((currentPage.getPage(getIO(), currentIndex)) != null) {
            seekRightTree();
            (currentIndex)++;
        }
    }else
        currentIndex = 0;
    
    atKey = false;
}