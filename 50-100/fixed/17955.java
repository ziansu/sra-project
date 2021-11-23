@java.lang.Override
public void discardDerivedState(org.eclipse.xtext.resource.DerivedStateAwareResource resource) {
    org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> temp = resource.getAllContents();
    while (temp.hasNext()) {
        org.eclipse.emf.ecore.EObject obj = temp.next();
        if (obj instanceof org.xtext.urdf.myURDF.Topology) {
        }
        if (obj instanceof org.xtext.urdf.myURDF.AddTo) {
        }
    } 
}