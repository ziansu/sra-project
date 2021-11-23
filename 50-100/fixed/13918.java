public void setSelected(org.primefaces.model.TreeNode selectedNode) throws java.lang.Exception {
    cleanSelection(getRoot());
    if (selectedNode == null)
        return ;
    
    this.selectedNode = selectedNode;
    this.selectedNode.setSelected(true);
    org.tura.platform.datacontrol.TreePath[] p = getPath(selectedNode);
    if (!(compareArrays(((org.tura.platform.datacontrol.TreePath[]) (dc.getCurrentPosition())), p)))
        dc.setCurrentPosition(p);
    
}