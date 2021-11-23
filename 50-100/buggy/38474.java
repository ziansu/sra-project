static de.ollosoft.jarvisclient.api.data.runtime.JarvisResult sendRequest(android.content.Context context, de.ollosoft.jarvisclient.api.data.persistent.AbstractDatabaseObject subject, java.lang.String path) {
    de.ollosoft.jarvisclient.api.data.runtime.JarvisMessage msg = new de.ollosoft.jarvisclient.api.data.runtime.JarvisMessage(de.ollosoft.jarvisclient.api.RequestHandler.getEncoded(subject.Id));
    de.ollosoft.jarvisclient.api.data.runtime.JarvisResult response = de.ollosoft.jarvisclient.api.RequestHandler.handleRequest(context, de.ollosoft.jarvisclient.api.JarvisUtils.serialize(msg), path);
    return response;
}