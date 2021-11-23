public void constructPostDomination(microbat.codeanalysis.bytecode.CFG cfg) {
    for (microbat.codeanalysis.bytecode.CFGNode node : cfg.getNodeList()) {
        for (microbat.codeanalysis.bytecode.CFGNode parent : node.getParents()) {
            if (!(parent.isBranch())) {
                node.addPostDominatee(parent);
            }
        }
        node.addPostDominatee(node);
    }
    extendPostDominatee(cfg);
}