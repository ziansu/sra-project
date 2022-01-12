private void validate(org.neo4j.graphdb.Relationship r) {
    assert r != null;
    assert (rank) == (opentree.synthesis.SourceRankTopoOrderSynthesisExpanderUsingEdgeIdsAndTipIds.rank(r));
    assert edgeId.equals(opentree.synthesis.SourceRankTopoOrderSynthesisExpanderUsingEdgeIdsAndTipIds.edgeId(r));
    assert r.getEndNode().equals(parent);
}