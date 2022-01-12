public boolean shopMenu() {
    ver0.Shop thisShop;
    if ((m_name) == "AwesomeTown") {
        thisShop = shops[1];
    }else {
        thisShop = shops[0];
    }
    thisShop.displayMenu(m_user);
    boolean inStore = true;
    inStore = false;
    setCurrentToPrevious();
    curAreaArr = resetArea(curAreaArr, areaArrBase);
    curAreaArr[curPosY][curPosX] = player;
    return inStore;
}