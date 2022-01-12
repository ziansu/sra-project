private D save(final T type) {
    I id = type.getId();
    if (id == null) {
        id = ((I) (generateId()));
        type.setId(id);
    }
    checkType(type);
    final java.lang.String filename = getFilename(id);
    fileRepositorySupport.save(type, filename);
    collection.put(id, type);
    return mapper.map(type, dtoClass);
}