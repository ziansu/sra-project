@java.lang.Override
public de.unihamburg.sickstore.backend.anomaly.Anomaly handleRequest(de.unihamburg.sickstore.backend.anomaly.ClientRequest request, java.util.Set<de.unihamburg.sickstore.database.Node> nodes) {
    de.unihamburg.sickstore.backend.anomaly.Anomaly anomaly = new de.unihamburg.sickstore.backend.anomaly.Anomaly();
    if ((request instanceof de.unihamburg.sickstore.backend.anomaly.ClientRequestWrite) && ((stalenessGenerator) != null)) {
        anomaly.setStalenessMap(stalenessGenerator.generateStalenessMap(nodes, request));
    }
    if ((request instanceof de.unihamburg.sickstore.backend.anomaly.ClientRequestRead) || (request instanceof de.unihamburg.sickstore.backend.anomaly.ClientRequestScan)) {
        anomaly.setResponsiveNode(clientDelayGenerator.getResponsiveNode(request, nodes));
    }
    return anomaly;
}