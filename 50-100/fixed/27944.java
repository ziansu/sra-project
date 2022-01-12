public java.util.List<soot.toolkits.graph.Block> reversePostOrder() {
    if (!(isEmpty)) {
        soot.toolkits.graph.PseudoTopologicalOrderer<soot.toolkits.graph.Block> pto = new soot.toolkits.graph.PseudoTopologicalOrderer<soot.toolkits.graph.Block>();
        java.util.List<soot.toolkits.graph.Block> rpo = pto.newList(this, false);
        return rpo;
    }else {
        java.util.List<soot.toolkits.graph.Block> rpo = new java.util.ArrayList<soot.toolkits.graph.Block>();
        rpo.addAll(mHeads);
        rpo.addAll(mTails);
        return rpo;
    }
}