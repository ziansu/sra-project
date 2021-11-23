private java.lang.String getUriFromId(java.lang.String id) {
    com.metabroadcast.common.ids.SubstitutionTableNumberCodec codec = com.metabroadcast.common.ids.SubstitutionTableNumberCodec.lowerCaseOnly();
    java.lang.Long decodedId = codec.decode(id).longValue();
    org.atlasapi.persistence.lookup.entry.LookupEntry lookupEntry = com.google.common.collect.Iterables.getOnlyElement(lookupStore.entriesForIds(com.google.common.collect.ImmutableList.of(decodedId)));
    return lookupEntry.uri();
}