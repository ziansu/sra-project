@java.lang.Override
public void doSave(org.eclipse.core.runtime.IProgressMonitor monitor) {
    java.util.List<java.lang.String> artefactOrder = new java.util.ArrayList<java.lang.String>();
    for (java.lang.Object module : orderedModules) {
        artefactOrder.add(((org.eclipse.wst.server.core.IModule) (module)).getId());
    }
    if (!(serverWorkingCopy.getArtefactOrder().equals(artefactOrder))) {
        updating = true;
        execute(new org.eclipse.virgo.ide.runtime.internal.core.actions.ModifyArtefactOrderCommand(serverWorkingCopy, artefactOrder));
        updating = false;
    }
}