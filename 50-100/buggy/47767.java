@java.lang.Override
public int calculateCost(AI.Node grid) {
    int y = (this.goalY) - (grid.getYpos());
    int x = (this.goalX) - (grid.getXpos());
    return java.lang.Math.abs((x + y));
}