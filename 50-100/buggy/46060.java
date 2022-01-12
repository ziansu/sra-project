public void unbind(android.content.Context context, java.lang.Class<? extends xiaofei.library.hermes.HermesService> service) {
    synchronized(mBounds) {
        java.lang.Boolean bound = mBounds.get(service);
        if ((bound != null) && bound) {
            synchronized(mHermesServiceConnections) {
                xiaofei.library.hermes.internal.Channel.HermesServiceConnection connection = mHermesServiceConnections.get(service);
                if (connection != null) {
                    context.unbindService(connection);
                }
            }
        }
    }
}