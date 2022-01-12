public void doRemove() throws java.rmi.RemoteException, ucar.unidata.idv.control.VisADException {
    super.doRemove();
    if ((viewContents) != null) {
        java.awt.Container parent = viewContents.getParent();
        if (parent != null) {
            parent.remove(viewContents);
        }
        viewContents = null;
    }
}