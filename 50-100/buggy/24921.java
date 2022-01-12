private java.lang.String minimize(net.oneandone.jasmin.model.MimeType type, java.lang.String... sources) throws java.io.IOException {
    net.oneandone.sushi.fs.Node dest;
    net.oneandone.jasmin.model.References references;
    dest = world.memoryNode();
    try (java.io.Writer writer = dest.createWriter()) {
        references = new net.oneandone.jasmin.model.References(type, true);
        for (java.lang.String source : sources) {
            references.add(true, world.memoryNode(source));
        }
        references.writeTo(writer);
    }
    return dest.readString();
}