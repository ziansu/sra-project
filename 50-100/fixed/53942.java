public void enterRoomText() {
    (counter2)--;
    if (((counter2) < 0) && ((flag) == 0)) {
        entranceText = new TextPanel("RoomEntranceText");
        addObject(entranceText, ((getWidth()) / 2), ((getHeight()) / 2));
        flag = 1;
    }
    if (Greenfoot.isKeyDown("enter")) {
        counter2 = 50;
        removeObject(entranceText);
        flag = 2;
    }
}