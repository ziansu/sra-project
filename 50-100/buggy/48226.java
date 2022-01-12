private void clearThisHighway() {
    java.lang.System.out.println("Got to clear this Highways");
    while (!(this.highwayBlocks.empty())) {
        com.gridworld.grid.Coordinates C = this.highwayBlocks.pop();
        this.GridSquares[C.XVal][C.YVal].memberOfHorizontalHighway = false;
        this.GridSquares[C.XVal][C.YVal].memberOfVerticalHighway = false;
    } 
    return ;
}