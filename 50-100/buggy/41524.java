public boolean shopMenu() {
    ver0.Shop thisShop;
    if ((m_name) == "AwesomeTown") {
        thisShop = shops[2];
    }else {
        thisShop = shops[1];
    }
    thisShop.displayMenu(m_user);
    boolean inStore = true;
    inStore = false;
    setCurrentToPrevious();
    curAreaArr = resetArea(curAreaArr, areaArrBase);
    curAreaArr[curPosY][curPosX] = player;
    return inStore;
}