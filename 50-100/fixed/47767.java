@java.lang.Override
public int calculateCost(AI.Node grid) {
    int y = java.lang.Math.abs(((this.goalY) - (grid.getYpos())));
    int x = java.lang.Math.abs(((this.goalX) - (grid.getXpos())));
    return java.lang.Math.abs((x + y));
}