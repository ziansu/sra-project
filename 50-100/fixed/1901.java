@java.lang.Override
public void doSave(org.eclipse.core.runtime.IProgressMonitor monitor) {
    java.util.List<java.lang.String> artefactOrder = new java.util.ArrayList<java.lang.String>();
    for (java.lang.Object module : this.orderedModules) {
        artefactOrder.add(((org.eclipse.wst.server.core.IModule) (module)).getId());
    }
    if (!(this.serverWorkingCopy.getArtefactOrder().equals(artefactOrder))) {
        this.updating = true;
        execute(new org.eclipse.virgo.ide.runtime.internal.core.actions.ModifyArtefactOrderCommand(this.serverWorkingCopy, artefactOrder));
        this.updating = false;
    }
}