@java.lang.Override
public void run() {
    client.alive(address, new io.datakernel.hashfs.ResultCallback<java.util.Set<io.datakernel.hashfs.Replica>>() {
        @java.lang.Override
        public void onResult(java.util.Set<io.datakernel.hashfs.Replica> result) {
            onShowAliveResponse(eventloop.currentTimeMillis(), result);
        }

        @java.lang.Override
        public void onException(java.lang.Exception ignored) {
        }
    });
    updateServersMap(eventloop, address);
}