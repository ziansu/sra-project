public void start() {
    java.io.File fileToLoad;
    try {
        jaxbContext = javax.xml.bind.JAXBContext.newInstance(org.eclipse.ice.datastructures.ICEObject.ICEList.class, org.eclipse.ice.datastructures.form.Material.class, org.eclipse.ice.datastructures.form.MaterialStack.class);
    } catch (javax.xml.bind.JAXBException e) {
        org.eclipse.ice.materials.XMLMaterialsDatabase.logger.error("Unable to initialize JAXB!", e);
    }
    if (userDatabase.exists()) {
        org.eclipse.ice.materials.XMLMaterialsDatabase.logger.info("Loading user-modified database.");
        fileToLoad = userDatabase;
    }else {
        fileToLoad = defaultDatabase;
    }
    loadDatabase(fileToLoad);
    org.eclipse.ice.materials.XMLMaterialsDatabase.logger.info("Started!");
    return ;
}