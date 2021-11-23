public boolean innMenu() {
    ver0.Inn thisInn;
    if ((m_name) == "AwesomeTown") {
        thisInn = new ver0.Inn(1);
    }else {
        thisInn = new ver0.Inn(0);
    }
    thisInn.menu(m_user);
    boolean inInn = true;
    inInn = false;
    setCurrentToPrevious();
    curAreaArr = resetArea(curAreaArr, areaArrBase);
    curAreaArr[curPosY][curPosX] = player;
    return inInn;
}