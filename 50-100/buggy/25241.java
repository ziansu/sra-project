@java.lang.Override
public boolean write(java.io.OutputStream outputStream) throws org.bimserver.BimserverDatabaseException, org.bimserver.plugins.serializers.SerializerException {
    this.printWriter = new org.bimserver.utils.UTF8PrintWriter(outputStream);
    boolean result = false;
    try {
        result = processMode();
    } catch (java.io.IOException e) {
        throw new org.bimserver.plugins.serializers.SerializerException(e);
    }
    return result;
}