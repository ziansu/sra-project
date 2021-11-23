public void getSelectMainMenu() {
    this.showMainMenu();
    int tmp = getUserInput(0);
    if (tmp != 10)
        this.selectedMenu = tmp;
    else
        this.selectedMenu = 0;
    
}