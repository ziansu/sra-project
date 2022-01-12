@java.lang.Override
public void discardDerivedState(org.eclipse.xtext.resource.DerivedStateAwareResource resource) {
    org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> temp = resource.getAllContents();
    while (temp.hasNext()) {
        org.eclipse.emf.ecore.EObject obj = temp.next();
        if (obj instanceof org.xtext.urdf.myURDF.Topology) {
            org.xtext.urdf.myURDF.Topology topo = ((org.xtext.urdf.myURDF.Topology) (obj));
            topo.setParent(null);
            topo.setChild(null);
            topo.setJoint(null);
        }
        if (obj instanceof org.xtext.urdf.myURDF.AddTo) {
        }
    } 
}