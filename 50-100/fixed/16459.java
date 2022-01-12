public <M extends com.google.protobuf.Message> java.util.concurrent.Future<M> remove(com.google.protobuf.Message msg) throws org.dc.jul.exception.CouldNotPerformException {
    try {
        return ((java.util.concurrent.Future<M>) (invokeMethod("remove", msg)));
    } catch (org.dc.jul.exception.CouldNotPerformException ex) {
        throw new org.dc.jul.exception.CouldNotPerformException((("Could not remove [" + msg) + "]"), ex);
    }
}