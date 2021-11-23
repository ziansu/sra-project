static de.ollosoft.jarvisclient.api.data.runtime.JarvisResult sendRequest(android.content.Context context, java.util.List<? extends de.ollosoft.jarvisclient.api.data.persistent.AbstractDatabaseObject> subjects, java.lang.String path) {
    java.util.List<java.lang.String> subjectIds = new java.util.ArrayList<>();
    for (de.ollosoft.jarvisclient.api.data.persistent.AbstractDatabaseObject subject : subjects)
        subjectIds.add(subject.Id);
    
    de.ollosoft.jarvisclient.api.data.runtime.JarvisMessage msg = new de.ollosoft.jarvisclient.api.data.runtime.JarvisMessage(de.ollosoft.jarvisclient.api.RequestHandler.getEncoded(subjectIds));
    de.ollosoft.jarvisclient.api.data.runtime.JarvisResult response = de.ollosoft.jarvisclient.api.RequestHandler.handleRequest(context, de.ollosoft.jarvisclient.api.JarvisUtils.serialize(msg), path);
    return response;
}