@java.lang.Override
public void registerPackages(org.eclipse.emf.ecore.resource.ResourceSet resourceSet) {
    super.registerPackages(resourceSet);
    if (!(isInWorkspace(fr.lip6.move.pnml.ptnet.PtnetPackage.class))) {
        resourceSet.getPackageRegistry().put(fr.lip6.move.pnml.ptnet.PtnetPackage.eINSTANCE.getNsURI(), fr.lip6.move.pnml.ptnet.PtnetPackage.eINSTANCE);
    }
}