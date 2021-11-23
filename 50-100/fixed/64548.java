private org.eclipse.emf.ecore.resource.ResourceSet initProgressMonitor(org.eclipse.core.runtime.IProgressMonitor monitor) {
    org.eclipse.emf.ecore.resource.ResourceSet rs = org.osate.aadl2.modelsupport.resources.OsateResourceUtil.createResourceSet();
    org.osate.aadl2.modelsupport.resources.OsateResourceUtil.refreshResourceSet(rs);
    java.util.HashSet<org.eclipse.core.resources.IFile> files = org.osate.aadl2.modelsupport.modeltraversal.TraverseWorkspace.getAadlandInstanceFilesInWorkspace();
    monitor.beginTask("Translating AADL to Java / MIDAS", ((files.size()) + 1));
    return rs;
}