protected void clearValuesHvePte() {
    values.clear();
    hv_edges.clear();
    pt_edges.clear();
    neq.clear();
    pathPredicate.clear();
    errorPredicate.clear();
    addValue(org.sosy_lab.cpachecker.cpa.smg.graphs.SMG.nullAddress);
    org.sosy_lab.cpachecker.cpa.smg.SMGEdgePointsTo nullPointer = new org.sosy_lab.cpachecker.cpa.smg.SMGEdgePointsTo(org.sosy_lab.cpachecker.cpa.smg.graphs.SMG.nullAddress, org.sosy_lab.cpachecker.cpa.smg.graphs.SMG.nullObject, 0);
    addPointsToEdge(nullPointer);
}