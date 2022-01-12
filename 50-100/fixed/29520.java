private org.hawk.modelio.exml.metamodel.MPackage createMetaPackage() {
    java.lang.String pkgId = "ModelioMetaPackage";
    org.hawk.modelio.exml.metamodel.MPackage mpkg = new org.hawk.modelio.exml.metamodel.MPackage(pkgId, pkgId, "00.00.00", "");
    final org.hawk.modelio.exml.metamodel.MClass mt = new org.hawk.modelio.exml.metamodel.MClass(org.hawk.modelio.exml.metamodel.ModelioMetaModelResource.META_TYPE_NAME, org.hawk.modelio.exml.metamodel.ModelioMetaModelResource.META_TYPE_NAME, mpkg.getExml());
    mt.getMAttributes().add(createStringAttribute(mpkg, mt.getName(), "name"));
    mpkg.getMClass().add(mt);
    return mpkg;
}