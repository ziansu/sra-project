public value.QList evalRpTEXT(XQueryParser.RpTEXTContext ctx) {
    value.QList res = new value.QList();
    for (org.w3c.dom.Node node : nodelstSt.peek()) {
        org.w3c.dom.Node n = node.getChildNodes().item(0);
        if ((n.getNodeType()) == 3)
            res.add(n);
        
    }
    return res;
}