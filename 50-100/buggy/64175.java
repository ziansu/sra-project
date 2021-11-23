@java.lang.Override
public E load(org.xwiki.bridge.DocumentModelBridge document) throws java.lang.IllegalArgumentException {
    try {
        getEntityConstructor().newInstance(document);
    } catch (java.lang.InstantiationException | java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException ex) {
        this.logger.error("Failed to instantiate primary entity of type [{}] from document [{}]: {}", getEntityXClassReference(), document, ex.getMessage());
    }
    return null;
}