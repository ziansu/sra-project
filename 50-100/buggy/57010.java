@java.lang.Override
public com.fasterxml.jackson.databind.node.ObjectNode doGetOperation(java.lang.String identifier) throws org.onosproject.restconf.api.RestconfException {
    org.onosproject.yms.ydt.YdtBuilder ydtBuilder = ymsService.getYdtBuilder(getRestconfRootPath(), null, YmsOperationType.QUERY_REQUEST);
    org.onosproject.restconf.utils.parser.json.ParserUtils.convertUriToYdt(identifier, ydtBuilder, null);
    org.onosproject.yms.ydt.YdtResponse ydtResponse = ymsService.executeOperation(ydtBuilder);
    org.onosproject.yms.ydt.YdtContext rootNode = ydtResponse.getRootNode();
    java.lang.String requestNodeName = org.onosproject.restconf.utils.parser.json.ParserUtils.getLastSegmentNodeName(identifier);
    return org.onosproject.restconf.utils.parser.json.ParserUtils.convertYdtToJson(requestNodeName, rootNode, ymsService.getYdtWalker());
}