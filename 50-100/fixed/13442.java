@java.lang.Override
protected eu.interedition.collatex.dekker.Dekker21Aligner.DecisionGraphNodeCost distBetween(eu.interedition.collatex.dekker.Dekker21Aligner.ExtendedGraphNode current, eu.interedition.collatex.dekker.Dekker21Aligner.ExtendedGraphNode neighbor) {
    eu.interedition.collatex.dekker.Dekker21Aligner.ExtendedGraphEdge edge = this.edgeBetween(current, eu.interedition.collatex.dekker.Dekker21Aligner.EditOperationEnum.MATCH_TOKENS_OR_REPLACE);
    if ((edge != null) && (this.getTarget(edge).equals(neighbor))) {
        eu.interedition.collatex.dekker.LCP_Interval graphInterval = edge.lcp_interval;
        eu.interedition.collatex.dekker.LCP_Interval witnessInterval = lcp_interval_array[((startRangeWitness2) + (current.startPosWitness2))];
        if (graphInterval == witnessInterval) {
            neighbor.match = true;
            return new eu.interedition.collatex.dekker.Dekker21Aligner.DecisionGraphNodeCost(graphInterval.length);
        }
    }
    return new eu.interedition.collatex.dekker.Dekker21Aligner.DecisionGraphNodeCost(0);
}