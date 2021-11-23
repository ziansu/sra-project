public boolean computeDependencies(org.jahia.data.templates.JahiaTemplatesPackage pack) {
    pack.resetDependencies();
    computeResourceBundleHierarchy(pack);
    for (org.jahia.data.templates.JahiaTemplatesPackage aPackage : packagesById.values()) {
        if ((aPackage.getDepends().contains(pack.getId())) || (aPackage.getDepends().contains(pack.getName()))) {
            computeDependencies(aPackage);
        }
    }
    return computeDependencies(pack, pack);
}