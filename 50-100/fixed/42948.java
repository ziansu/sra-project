@java.lang.Override
public javax.json.stream.JsonGenerator writeStartArray(final java.lang.String name) {
    if (((currentStructureElement) == null) || (currentStructureElement.isArray)) {
        throw new javax.json.stream.JsonGenerationException("Method must not be called within an array context");
    }
    final org.apache.johnzon.core.JsonGeneratorImpl.StructureElement localStructureElement = new org.apache.johnzon.core.JsonGeneratorImpl.StructureElement(currentStructureElement, true);
    currentStructureElement = localStructureElement;
    addCommaIfNeeded();
    writeCachedOrEscape(name);
    noCheckWrite(org.apache.johnzon.core.START_ARRAY_CHAR);
    (depth)++;
    return this;
}