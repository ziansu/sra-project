private boolean toggleEdgeWithTimeBasedSMA(matcha.BackTestingParameters backTestingParameters, matcha.PositionStats positionStats) {
    final double sma30 = positionStats.getSma30(backTestingParameters.getMovingAverageDayCount());
    boolean haveEdge = false;
    if (sma30 == (PositionStats.NOT_ENOUGH_DATA_FOR_EDGE)) {
        haveEdge = false;
    }else
        if (sma30 < ((backTestingParameters.getEdgeLevel()) * (-1))) {
            haveEdge = true;
        }else
            if (sma30 > (backTestingParameters.getEdgeLevel())) {
                haveEdge = true;
            }
        
    
    return haveEdge;
}