public void removeChild(net.java.amateras.uml.model.AbstractUMLModel model) {
    children.remove(model);
    model.setParent(this);
    firePropertyChange(net.java.amateras.uml.model.AbstractUMLEntityModel.P_CHILDREN, null, model);
}