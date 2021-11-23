private boolean toggleEdges(matcha.BackTestingParameters backTestingParameters, matcha.PositionStats positionStats, boolean haveEdge) {
    if (backTestingParameters.isWithEdge()) {
        haveEdge = toggleEdgeWithTimeBasedSMA(backTestingParameters, positionStats, haveEdge);
    }else
        if (backTestingParameters.isWithTradeCountEdge()) {
            haveEdge = toggleEdgeWithTradeCountSMA(backTestingParameters, positionStats, haveEdge);
        }
    
    return haveEdge;
}