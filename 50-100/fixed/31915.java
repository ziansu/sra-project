public value.QList evalApDSL(XQueryParser.ApDSLContext ctx) {
    value.QList lst = new value.QList();
    java.lang.String xmlFile = ctx.fileName().getText();
    xmlFile = xmlFile.substring(1, ((xmlFile.length()) - 1));
    lst.add(this.readXML(xmlFile));
    lst = lst.getDescedants();
    nodelstSt.push(lst);
    return ((value.QList) (visitor.visit(ctx.rp())));
}