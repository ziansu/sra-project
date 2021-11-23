public java.lang.String getNodeSNVString() {
    java.lang.String s = "";
    for (consensus.PHYNode n : treeNodes) {
        if ((n.getSNVGroup()) == null)
            continue;
        
        java.util.ArrayList<consensus.SNVEntry> snvs = n.getSNVs();
        s += n.getNodeId();
        s += "\t" + (n.getSampleProfile().getTag());
        for (consensus.SNVEntry snv : snvs) {
            s += "\t" + (snv.getDescription());
        }
        s += "\n";
    }
    return s;
}