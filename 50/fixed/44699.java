public elevator.ElevatorInterface getElevatorInterface(int elevatorID) {
    if ((elevatorID > 0) && (elevatorID <= (elevator.ElevatorGroup.numElevators)))
        return elevator.ElevatorGroup.ebi[(elevatorID - 1)];
    else {
        java.lang.System.out.println("No Such floor.");
        return null;
    }
}