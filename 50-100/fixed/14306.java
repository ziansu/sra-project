public void idle() {
    while (floorReq.isEmpty()) {
        if ((currentLevel) != 0) {
            java.lang.System.out.println((((("elevator " + (elevatorid)) + ": going down from ") + (currentLevel)) + " to idle"));
            goDown();
        }else {
            direction = Elevator.Direction.IDLE;
        }
    } 
    java.lang.System.out.println((("elevator " + (elevatorid)) + ": received request. stopping idling to service"));
    move();
}