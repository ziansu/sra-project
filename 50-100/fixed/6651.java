@java.lang.Override
public java.lang.Object visitArrayVariable(DECAF2.DECAF2Parser.ArrayVariableContext ctx) {
    java.lang.String nombreVar = ctx.getChild(0).getText();
    int locationSave = java.lang.Integer.parseInt(ctx.getChild(2).getText());
    java.util.ArrayList returnArray = new java.util.ArrayList();
    returnArray.add(nombreVar);
    returnArray.add(locationSave);
    return returnArray;
}