public void enterArrayAccess(ceylon.tool.converter.java2ceylon.ArrayAccessContext ctx) {
    try {
        enterArrayAccess = true;
        if ((ctx.expressionName()) != null)
            bw.write(((((ctx.expressionName().getText()) + ".set(") + (ctx.expression(0).getText())) + ", "));
        
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}