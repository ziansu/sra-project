@java.lang.Override
protected void processDocument(org.springframework.data.crate.core.mapping.CrateDocument document) {
    document.remove(org.springframework.data.crate.core.mapping.CratePersistentProperty.RESERVED_VESRION_FIELD_NAME);
}