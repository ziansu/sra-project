public void move() {
    Logger.CallLogging("RailroadCar", "move()");
    Track s1 = new Track();
    Track s2 = new Track();
    RailroadCar r = new RailroadCar();
    StaticElement temp = s2.getNextElement(s1);
    setPrevious(s2);
    setCurrent(temp);
    s2.leaveElement(this);
    temp.stepToElement(this);
    Logger.CallLogging("RailroadCar", "move()");
}