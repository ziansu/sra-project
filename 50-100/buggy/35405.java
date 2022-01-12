@java.lang.Override
public void addWriteBackEdge() {
    for (java.util.Map.Entry<org.elasql.sql.RecordKey, org.elasql.schedule.tpart.Node> resPosPair : resPos.entrySet()) {
        org.elasql.sql.RecordKey res = resPosPair.getKey();
        org.elasql.schedule.tpart.Node node = resPosPair.getValue();
        if ((node.getTask()) != null) {
            node.addWriteBackEdges(new org.elasql.schedule.tpart.Edge(sinkNodes[node.getPartId()], res));
            parMeta.setPartition(res, node.getPartId());
        }
    }
    resPos.clear();
}