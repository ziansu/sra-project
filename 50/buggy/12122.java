public eu.interedition.collatex.dekker.Dekker21Aligner.ExtendedGraphEdge edgeBetween(eu.interedition.collatex.dekker.Dekker21Aligner.ExtendedGraphNode source, eu.interedition.collatex.dekker.Dekker21Aligner.EditOperationEnum operation) {
    eu.interedition.collatex.dekker.Dekker21Aligner.ExtendedGraphEdge edge = edges.get(new eu.interedition.collatex.dekker.Dekker21Aligner.ExtendedGraphNodeTuple(source, operation));
    if (edge == null) {
        throw new java.lang.RuntimeException("Edge not present!");
    }
    return edge;
}