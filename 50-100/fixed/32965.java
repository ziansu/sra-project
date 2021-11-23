protected void fireRemovingChild(org.eclipse.gef.EditPart child, int index) {
    super.fireRemovingChild(child, index);
    if (((child.getModel()) instanceof no.hib.dpf.diagram.DNode) && ((((no.hib.dpf.diagram.DNode) (child.getModel())).getNode()) != null))
        verifyOnNodeChange(this.getDGraph().getGraph(), null, ((no.hib.dpf.diagram.DNode) (child.getModel())).getNode());
    
}