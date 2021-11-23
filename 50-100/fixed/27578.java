public <M extends com.google.protobuf.Message> java.util.concurrent.Future<M> register(com.google.protobuf.Message msg) throws org.dc.jul.exception.CouldNotPerformException {
    try {
        return ((java.util.concurrent.Future<M>) (invokeMethod("register", msg)));
    } catch (org.dc.jul.exception.CouldNotPerformException ex) {
        throw new org.dc.jul.exception.CouldNotPerformException((("Could not register [" + msg) + "]"), ex);
    }
}