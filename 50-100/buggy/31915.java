public value.QList evalApDSL(XQueryParser.ApDSLContext ctx) {
    value.QList lst = new value.QList();
    java.lang.String xmlFile = ctx.fileName().getText();
    lst.add(this.readXML(xmlFile));
    lst = lst.getDescedants();
    nodelstSt.push(lst);
    return ((value.QList) (visitor.visit(ctx.rp())));
}