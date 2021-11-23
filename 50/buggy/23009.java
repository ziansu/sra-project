public static net.oneandone.jasmin.model.References create(net.oneandone.jasmin.model.MimeType type, boolean minimize, net.oneandone.sushi.fs.Node node) {
    net.oneandone.jasmin.model.References result;
    result = new net.oneandone.jasmin.model.References(type, minimize);
    result.add(minimize, node);
    return result;
}