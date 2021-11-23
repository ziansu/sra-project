public <T extends br.org.cesar.knot.lib.model.AbstractThingDevice> void socketIOGetDeviceList(final java.util.List<T> typeThing, org.json.JSONObject query, final br.org.cesar.knot.lib.event.Event<java.util.List<T>> callbackResult) throws br.org.cesar.knot.lib.exception.InvalidParametersException, br.org.cesar.knot.lib.exception.KnotException, br.org.cesar.knot.lib.exception.SocketNotConnected {
    if (((socketIO) != null) && (isSocketConnected())) {
        socketIO.getDeviceList(typeThing, query, callbackResult);
    }else {
        throw new br.org.cesar.knot.lib.exception.SocketNotConnected("Socket not connected or invalid. Did you call the method setupSocketIO?");
    }
}