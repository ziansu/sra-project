@java.lang.Override
public boolean execute(com.company.data.RobotState currentState, com.company.data.SquareBoard board) {
    switch (currentState.getDirection()) {
        case N :
            currentState.setDirection(Direction.W);
            break;
        case E :
            currentState.setDirection(Direction.E);
            break;
        case S :
            currentState.setDirection(Direction.N);
            break;
        case W :
            currentState.setDirection(Direction.S);
            break;
    }
    return true;
}