private boolean toggleEdges(matcha.BackTestingParameters backTestingParameters, matcha.PositionStats positionStats) {
    boolean haveEdge = false;
    if (backTestingParameters.isWithEdge()) {
        haveEdge = toggleEdgeWithTimeBasedSMA(backTestingParameters, positionStats);
    }else
        if (backTestingParameters.isWithTradeCountEdge()) {
            haveEdge = toggleEdgeWithTradeCountSMA(backTestingParameters, positionStats);
        }
    
    return haveEdge;
}