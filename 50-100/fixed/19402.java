private void writeDictionaryElement(final com.rider.jbencode.types.BencodingDictionary element, final java.lang.StringBuilder builder) {
    builder.append(com.rider.jbencode.Bencoder.START_DICTIONARY);
    for (final java.lang.String subElement : element.keySet()) {
        writeStringElement(new com.rider.jbencode.types.BencodingString(subElement), builder);
        writeElement(element.get(subElement), builder);
    }
    builder.append(com.rider.jbencode.Bencoder.TERMINATION_CHARACTER);
}