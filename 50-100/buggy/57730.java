private void removeClientDependency(orgomg.cwm.objectmodel.core.ModelElement client, orgomg.cwm.objectmodel.core.ModelElement supplier) {
    for (orgomg.cwm.objectmodel.core.Dependency dependency : client.getClientDependency()) {
        if (((dependency.getKind()) != null) && ((org.talend.cwm.dependencies.DependenciesHandler.USAGE.compareTo(dependency.getKind())) == 0)) {
            org.eclipse.emf.ecore.EObject resolvedObject = org.talend.cwm.helper.ResourceHelper.resolveObject(dependency.getSupplier(), supplier);
            if (resolvedObject != null) {
                client.getClientDependency().remove(dependency);
                return ;
            }
        }
    }
}