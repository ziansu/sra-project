private org.mycore.mets.model.MCRILogicalStructMapTypeProvider getTypeProvider() {
    java.lang.String className = org.mycore.common.config.MCRConfiguration.instance().getString("MCR.Component.MetsMods.LogicalStructMapTypeProvider", org.mycore.mets.model.MCRDefaultLogicalStructMapTypeProvider.class.getName());
    org.mycore.mets.model.MCRILogicalStructMapTypeProvider typeProvider = null;
    try {
        typeProvider = ((org.mycore.mets.model.MCRILogicalStructMapTypeProvider) (java.lang.Class.forName(className).newInstance()));
    } catch (java.lang.Exception e) {
        org.mycore.mets.model.MCRMETSDefaultGenerator.LOGGER.warn(("Could not load class " + className));
        return new org.mycore.mets.model.MCRDefaultLogicalStructMapTypeProvider();
    }
    return typeProvider;
}