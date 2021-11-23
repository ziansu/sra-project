public void move() {
    Logger.CallLogging("RailroadCar", "move()");
    Track s1 = new Track();
    Track s2 = new Track();
    RailroadCar r = new RailroadCar();
    s2.getNextElement(s1);
    Track temp = new Track();
    setPrevious(s2);
    setCurrent(temp);
    s2.leaveElement(this);
    temp.stepToElement(this);
    Logger.CallLogging("RailroadCar", "move()");
}