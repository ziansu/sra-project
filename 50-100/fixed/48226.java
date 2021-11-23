private void clearThisHighway() {
    while (!(this.highwayBlocks.empty())) {
        com.gridworld.grid.Coordinates C = this.highwayBlocks.pop();
        this.GridSquares[C.XVal][C.YVal].memberOfHorizontalHighway = false;
        this.GridSquares[C.XVal][C.YVal].memberOfVerticalHighway = false;
    } 
    return ;
}