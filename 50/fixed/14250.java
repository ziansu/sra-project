public void displayPreviousExhibitPage() {
    (currentPageIndex)--;
    if ((currentPageIndex) < 0)
        return ;
    
    displayCurrentExhibitPage();
}