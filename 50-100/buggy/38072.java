@java.lang.Override
public javax.json.stream.JsonGenerator writeStartObject(final java.lang.String name) {
    if (((currentStructureElement) == null) || (currentStructureElement.isArray)) {
        throw new javax.json.stream.JsonGenerationException("Method must not be called within an array context");
    }
    if ((currentStructureElement) == null) {
        currentStructureElement = new org.apache.johnzon.core.JsonGeneratorImpl.StructureElement(null, false);
    }else {
        final org.apache.johnzon.core.JsonGeneratorImpl.StructureElement localStructureElement = new org.apache.johnzon.core.JsonGeneratorImpl.StructureElement(currentStructureElement, false);
        currentStructureElement = localStructureElement;
    }
    addCommaIfNeeded();
    writeCachedOrEscape(name);
    noCheckWrite(org.apache.johnzon.core.START_OBJECT_CHAR);
    (depth)++;
    return this;
}