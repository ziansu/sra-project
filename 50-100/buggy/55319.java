public void move() {
    Logger.CallLogging("Locomotive", "move()");
    Track s2 = new Track();
    Track s3 = new Track();
    RailroadCar r = new RailroadCar();
    StaticElement temp = s3.getNextElement(s2);
    setPrevious(s3);
    setCurrent(temp);
    s3.leaveElement(this);
    temp.stepToElement(this);
    r.move();
    Logger.ReturnLogging("Locomotive", "move()");
}