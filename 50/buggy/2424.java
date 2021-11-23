@java.lang.Override
public void startRecord(final java.lang.String identifier) {
    currentPut = null;
    entityBuilder = null;
    entityDepth = 0;
    this.identifier = null;
    if (identifier != null) {
        this.identifier = identifier.getBytes(com.google.common.base.Charsets.UTF_8);
    }
}