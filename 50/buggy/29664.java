public void request(java.lang.String instruction, java.lang.String uri, java.util.Map<java.lang.String, java.lang.String> inputMap) {
    request(instruction, uri, null, new net.caustic.util.CollectionStringMap(uuid(), inputMap), new java.lang.String[]{  }, true);
}