public static void clearAllContainers() {
    if ((org.verapdf.model.impl.containers.StaticContainers.document) != null) {
        org.verapdf.model.impl.containers.StaticContainers.document = null;
    }
    org.verapdf.model.impl.containers.StaticContainers.flavour = null;
    org.verapdf.model.impl.containers.StaticContainers.separations.clear();
    org.verapdf.model.impl.containers.StaticContainers.inconsistentSeparations.clear();
    org.verapdf.model.impl.containers.StaticContainers.cachedColorSpaces.clear();
}