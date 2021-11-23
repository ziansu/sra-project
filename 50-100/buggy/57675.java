static de.ollosoft.jarvisclient.api.data.runtime.JarvisResult sendObject(android.content.Context context, de.ollosoft.jarvisclient.api.interfaces.JarvisItem item, java.lang.String path) {
    de.ollosoft.jarvisclient.api.data.runtime.JarvisMessage msg = new de.ollosoft.jarvisclient.api.data.runtime.JarvisMessage(de.ollosoft.jarvisclient.api.RequestHandler.getEncoded(item));
    de.ollosoft.jarvisclient.api.data.runtime.JarvisResult response = de.ollosoft.jarvisclient.api.RequestHandler.handleRequest(context, de.ollosoft.jarvisclient.api.JarvisUtils.serialize(msg), path);
    return response;
}