public static java.lang.String dump(org.raml.yagi.framework.nodes.Node node, java.lang.String start, java.lang.String separator, java.lang.String end) {
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    java.util.List<java.lang.String> children = org.raml.v2.internal.utils.JSonDumper.dumpChildren(node.getChildren());
    builder.append(start).append(org.apache.commons.lang.StringUtils.join(children, separator)).append(end);
    return builder.toString();
}