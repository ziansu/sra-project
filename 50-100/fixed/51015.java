public value.QList evalXqTAG(XQueryParser.XqTAGContext ctx) {
    if (!(ctx.leftT.getText().equals(ctx.rightT.getText()))) {
        java.lang.System.out.println("Two tagnames are not the same");
        return new value.QList();
    }
    return new value.QList(makeElem(((value.QList) (visitor.visit(ctx.xq()))), ctx.leftT.getText()));
}