@java.lang.Override
public void enterAnnotationTypeDeclaration(JavaParser.AnnotationTypeDeclarationContext ctx) {
    canCouple = false;
    if (!(location.isEmpty())) {
        outerClass = location.peek();
    }
    java.lang.String cName = ctx.getChild(2).getText();
    if (!(outerClass.equals(""))) {
        cName = ((outerClass) + ":") + cName;
    }
    location.push(cName);
    classes.put(cName, canCouple);
}