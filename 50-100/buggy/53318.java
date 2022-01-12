public gameElements.Box pickUpBox(gameElements.Player player) {
    gameElements.Box topBox = boxList.get(((boxList.size()) - 1));
    boxList.remove(((boxList.size()) - 1));
    if ((getBoxListWeight()) < (openWeight)) {
        door.close();
        java.lang.System.out.println("yolo");
    }
    return topBox;
}