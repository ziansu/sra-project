public void annotateClass(final org.jboss.marshalling.Marshaller marshaller, final java.lang.Class<?> clazz) throws java.io.IOException {
    final org.jboss.modules.Module module = org.jboss.modules.Module.forClass(clazz);
    if (module == null) {
        marshaller.writeObject(null);
    }else {
        final org.jboss.modules.ModuleIdentifier identifier = module.getIdentifier();
        marshaller.writeObject(identifier.getName());
        marshaller.writeObject(identifier.getSlot());
    }
}