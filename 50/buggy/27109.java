public tsp_simulator.VPE getSouthWestNeighbor() {
    if ((onBottomEdge()) || (onLeftEdge()))
        return null;
    else
        return vpa.getVPE(((xPos) + 1), ((yPos) - 1));
    
}