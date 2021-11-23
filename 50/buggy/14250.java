public void displayPreviousExhibitPage() {
    (currentPageIndex)--;
    if ((currentPageIndex) < 0)
        throw new java.lang.IndexOutOfBoundsException("currentPageIndex < 0");
    
    displayCurrentExhibitPage();
}