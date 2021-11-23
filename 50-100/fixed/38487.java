public org.rhwlab.BHC.NodeBase findAncestor(int label) {
    if ((this.getParent()) == null) {
        return null;
    }
    org.rhwlab.BHC.NodeBase par = ((org.rhwlab.BHC.NodeBase) (this.getParent()));
    if ((par.label) == label) {
        return par;
    }
    return par.findAncestor(label);
}