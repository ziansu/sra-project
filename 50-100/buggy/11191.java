public void enterArrayAccess_lfno_primary(ceylon.tool.converter.java2ceylon.ArrayAccess_lfno_primaryContext ctx) {
    try {
        enterArrayAccess_lfno_primary = true;
        if (equalsequalsNull) {
            bw.write("!");
        }
        bw.write(((((ctx.expressionName().getText()) + ".get(") + (ctx.expression(0).getText())) + ")"));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}