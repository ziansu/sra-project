public void annotateClass(final org.jboss.marshalling.Marshaller marshaller, final java.lang.Class<?> clazz) throws java.io.IOException {
    final org.jboss.modules.Module module = org.jboss.modules.Module.forClass(clazz);
    if (module == null) {
        throw new java.io.InvalidClassException(clazz.getName(), "Class is not present in any module");
    }
    final org.jboss.modules.ModuleIdentifier identifier = module.getIdentifier();
    marshaller.writeObject(identifier.getName());
    marshaller.writeObject(identifier.getSlot());
}