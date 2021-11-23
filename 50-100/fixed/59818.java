public static com.fasterxml.jackson.databind.node.ObjectNode convertYdtToJson(org.onosproject.yms.ydt.YdtContext ydtContext, org.onosproject.yms.ydt.YdtWalker walker) {
    org.onosproject.restconf.utils.parser.api.JsonBuilder builder = new org.onosproject.restconf.utils.parser.json.DefaultJsonBuilder();
    org.onosproject.yms.ydt.YdtListener listener = new org.onosproject.restconf.utils.parser.json.YdtToJsonListener(ydtContext.getName(), builder);
    walker.walk(listener, ydtContext);
    return builder.getTreeNode();
}