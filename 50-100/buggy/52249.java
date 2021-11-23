public final void createDeclaration(de.mannheim.wifo2.iop.service.model.IServiceDescription service) {
    if (declarations.containsKey(service.getId())) {
        return ;
    }
    try {
        org.ow2.chameleon.fuchsia.core.declaration.ImportDeclaration declaration = fr.liglab.adele.iop.device.importer.ServiceDeclaration.from(service);
        declarations.put(service.getId(), declaration);
        pendingDeclarations.put(declaration);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}