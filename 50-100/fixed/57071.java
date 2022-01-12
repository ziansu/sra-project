public value.QList evalApSL(XQueryParser.ApSLContext ctx) {
    value.QList lst = new value.QList();
    java.lang.String xmlFile = ctx.fileName().getText();
    xmlFile = xmlFile.substring(1, ((xmlFile.length()) - 1));
    lst.add(this.readXML(xmlFile));
    nodelstSt.push(lst);
    lst = ((value.QList) (visitor.visit(ctx.rp())));
    nodelstSt.pop();
    return lst;
}