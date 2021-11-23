private void writeDictionaryElement(final com.rider.jbencode.types.BencodingDictionary element, final java.lang.StringBuilder builder) {
    builder.append(com.rider.jbencode.Bencoder.START_DICTIONARY);
    for (final com.rider.jbencode.types.BencodingString subElement : element.keySet()) {
        writeStringElement(subElement, builder);
        writeElement(element.get(subElement), builder);
    }
    builder.append(com.rider.jbencode.Bencoder.TERMINATION_CHARACTER);
}