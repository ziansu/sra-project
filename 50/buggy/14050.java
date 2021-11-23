@java.lang.Override
public io.undertow.server.handlers.resource.Resource getResource(final java.lang.String s) throws java.io.IOException {
    return new io.inkstand.scribble.http.rules.FileSystemResource(fileSystem.getPath(s));
}