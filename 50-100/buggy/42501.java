@java.lang.Override
public void run() {
    heatDiffusionKernel = new org.cytoscape.tiedie.internal.logic.Kernel(currentnetwork);
    upstreamheatVector = upstreamheatVector.extractHeatVector("upstreamheat", nodeList, nodeTable);
    downstreamheatVector = downstreamheatVector.extractHeatVector("downstreamheat", nodeList, nodeTable);
    upstreamheatVectorDiffused = upstreamheatVectorDiffused.extractDiffusedHeatVector(upstreamheatVector, heatDiffusionKernel);
    downstreamheatVectorDiffused = downstreamheatVectorDiffused.extractDiffusedHeatVector(downstreamheatVector, heatDiffusionKernel);
    upnodeScoreMapDiffused = getDiffusedMap("upstreamheat", upstreamheatVectorDiffused);
    downnodeScoreMapDiffused = getDiffusedMap("downstreamheat", downstreamheatVectorDiffused);
    extractSubnetwork();
}