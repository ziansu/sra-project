public com.oracle.truffle.api.object.DynamicObject loadErrorCannotLoad(java.lang.String name, com.oracle.truffle.api.nodes.Node currentNode) {
    com.oracle.truffle.api.CompilerAsserts.neverPartOfCompilation();
    return loadError(java.lang.String.format("cannot load such file -- %s", name), currentNode);
}