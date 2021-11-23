@java.lang.Override
public java.util.Set<hillbillies.model.Cube> getDirectlyAdjacentCubes(java.util.Vector cubeCoordinates) {
    java.util.Set<hillbillies.model.Cube> adjacentCubes = new java.util.HashSet<>();
    for (int i = 0; i < 6; i++) {
        java.util.Vector pos = cubeCoordinates.add(getNextAdjacentDirection(i));
        if (isValidPosition(pos))
            adjacentCubes.add(getCube(pos));
        
    }
    return adjacentCubes;
}