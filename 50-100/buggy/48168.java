private void setOriginalFeatureName(de.ovgu.cide.fstgen.ast.FSTNonTerminal node, java.lang.String feature) {
    if (node.getType().equals("Feature")) {
        feature = node.getName();
    }
    for (de.ovgu.cide.fstgen.ast.FSTNode child : node.getChildren()) {
        if (child instanceof de.ovgu.cide.fstgen.ast.FSTNonTerminal) {
            setOriginalFeatureName(((de.ovgu.cide.fstgen.ast.FSTNonTerminal) (child)), feature);
        }else
            if (child instanceof de.ovgu.cide.fstgen.ast.FSTTerminal) {
                ((de.ovgu.cide.fstgen.ast.FSTTerminal) (child)).setOriginalFeatureName(feature);
            }
        
    }
}