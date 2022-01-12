public static double findLinkerCutoff(java.util.List<org.cytoscape.model.CyNode> nodeList, java.util.Set<org.cytoscape.model.CyNode> upstreamnodeheatSet, java.util.Set<org.cytoscape.model.CyNode> downstreamnodeSet, java.util.Map upnodeScoreMapDiffused, java.util.Map downnodeScoreMapDiffused, double sizeFactor) {
    double linker_cutoff;
    if (downnodeScoreMapDiffused == null) {
        linker_cutoff = org.cytoscape.tiedie.internal.logic.TieDieUtil.findLinkerCutoffSingle(nodeList, upstreamnodeheatSet, upnodeScoreMapDiffused, sizeFactor);
    }else {
        linker_cutoff = org.cytoscape.tiedie.internal.logic.TieDieUtil.findLinkerCutoffMulti(nodeList, upstreamnodeheatSet, downstreamnodeSet, upnodeScoreMapDiffused, downnodeScoreMapDiffused, sizeFactor);
    }
    return linker_cutoff;
}