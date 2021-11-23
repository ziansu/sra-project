public static edu.psu.sweng500.team8.coreDataStructures.Cell tryToFillACellWithOnlyOneAvailableNumber(edu.psu.sweng500.team8.coreDataStructures.Board board) {
    edu.psu.sweng500.team8.coreDataStructures.Cell mostConstrainedCell = edu.psu.sweng500.team8.solver.CommonSolverMethods.getMostConstrainedCell(board);
    java.util.Set<java.lang.Integer> availableNumbers = board.getCellConstraints(mostConstrainedCell).getAvailableNumbers();
    if ((availableNumbers.size()) > 1)
        return null;
    
    int number = availableNumbers.toArray(new java.lang.Integer[0])[0];
    mostConstrainedCell.setNumber(number);
    return mostConstrainedCell;
}