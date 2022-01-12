public void onClose(int closeCode, java.lang.String message) {
    this._physicalConnection = null;
    synchronized(_channels) {
        int len = _channels.size();
        for (int id = len - 1; id >= 0; id--) {
            org.eclipse.jetty.websocket.mux.MuxChannel channel = _channels.get(id);
            org.eclipse.jetty.websocket.mux.MuxConnection conn = new org.eclipse.jetty.websocket.mux.MuxConnection(id, _physicalConnection);
            conn.close();
            channel.onMuxClose(id, conn);
            _channels.remove(id);
        }
    }
}