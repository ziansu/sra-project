private long calculateCost(int target, java.lang.String source) {
    long cost = 0;
    if (!(no.ntnu.stud.torbjovn.elevator.CommandHandler.NODE_ID.equalsIgnoreCase(source)))
        cost += no.ntnu.stud.torbjovn.elevator.CommandHandler.COST_NOT_HERE;
    
    if (thisElevator.isMoving())
        cost += no.ntnu.stud.torbjovn.elevator.CommandHandler.COST_MOVING;
    
    cost += (java.lang.Math.abs(((java.lang.Math.abs(target)) - (thisElevator.getCurrentFloor())))) * (no.ntnu.stud.torbjovn.elevator.CommandHandler.COST_EACH_FLOOR);
    return cost;
}