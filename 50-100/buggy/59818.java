public static com.fasterxml.jackson.databind.node.ObjectNode convertYdtToJson(java.lang.String rootName, org.onosproject.yms.ydt.YdtContext ydtContext, org.onosproject.yms.ydt.YdtWalker walker) {
    org.onosproject.restconf.utils.parser.api.JsonBuilder builder = new org.onosproject.restconf.utils.parser.json.DefaultJsonBuilder();
    org.onosproject.yms.ydt.YdtListener listener = new org.onosproject.restconf.utils.parser.json.YdtToJsonListener(rootName, builder);
    walker.walk(listener, ydtContext);
    return builder.getTreeNode();
}