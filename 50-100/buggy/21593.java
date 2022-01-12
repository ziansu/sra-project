public java.util.ArrayList<fr.polytech.robots.Cell> getCellsAround(@com.sun.istack.internal.NotNull
fr.polytech.robots.Robot r) {
    fr.polytech.robots.Tuple robotPosition = r.getCell().getPosition();
    java.util.ArrayList<fr.polytech.robots.Tuple> positionsAround = _get8PositionsAround(robotPosition);
    java.util.ArrayList<fr.polytech.robots.Cell> cellsAround = new java.util.ArrayList(positionsAround.size());
    for (fr.polytech.robots.Tuple position : positionsAround) {
        cellsAround.add(cells.get(cells.get(position)));
    }
    return cellsAround;
}