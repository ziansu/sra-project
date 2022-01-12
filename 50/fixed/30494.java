private com.neovisionaries.ws.client.PerMessageCompressionExtension findAgreedPerMessageCompressionExtension() {
    if ((mAgreedExtensions) == null) {
        return null;
    }
    for (com.neovisionaries.ws.client.WebSocketExtension extension : mAgreedExtensions) {
        if (extension instanceof com.neovisionaries.ws.client.PerMessageCompressionExtension) {
            return ((com.neovisionaries.ws.client.PerMessageCompressionExtension) (extension));
        }
    }
    return null;
}