@java.lang.Override
void hOfNeighbor(view.Cell cell) {
    if ((cell.h) != null)
        return ;
    
    cell.h[1] = manhattanDistance(cell);
    cell.h[2] = euclideanDistance(cell);
    cell.h[3] = beelineDistance(cell);
    cell.h[0] = java.util.Arrays.stream(cell.h).max().getAsDouble();
}