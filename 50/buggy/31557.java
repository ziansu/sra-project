static void checkSerializableSelector(sbt.Selector selector) {
    if (!(selector instanceof java.io.Serializable)) {
        throw new java.lang.UnsupportedOperationException((("Selector implementation must be Serializable, but " + (selector.getClass().getName())) + " is not."));
    }
}