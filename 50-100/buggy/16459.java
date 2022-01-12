public <M extends com.google.protobuf.Message> M remove(com.google.protobuf.Message msg) throws org.dc.jul.exception.CouldNotPerformException {
    try {
        return ((java.util.concurrent.Future<M>) (invokeMethod("remove", msg))).get();
    } catch (org.dc.jul.exception.CouldNotPerformException | java.lang.InterruptedException | java.util.concurrent.ExecutionException ex) {
        throw new org.dc.jul.exception.CouldNotPerformException((("Could not remove [" + msg) + "]"), ex);
    }
}