public void getSelectUnderMenu() {
    this.showFeatureMenu();
    int tmp = getUserInput(1);
    if (tmp != 10)
        this.selectedMenu = tmp;
    else
        this.selectedMenu = 0;
    
}