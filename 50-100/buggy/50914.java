@java.lang.Override
public void enterInterfaceDeclaration(JavaParser.InterfaceDeclarationContext ctx) {
    canCouple = false;
    if (!(location.isEmpty())) {
        outerClass = location.peek();
    }
    java.lang.String cName = ctx.getChild(1).getText();
    if (!(outerClass.equals(""))) {
        cName = ((outerClass) + ":") + cName;
    }
    location.push(cName);
    classes.add(cName);
}