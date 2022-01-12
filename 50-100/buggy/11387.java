public void enterResult(ceylon.tool.converter.java2ceylon.ResultContext ctx) {
    try {
        if ((((ceylon.tool.converter.java2ceylon.MethodHeaderContext) (ctx.getParent())).typeParameters()) == null) {
            enterresult = true;
            if (ctx.getChild(0).toString().equals("void"))
                bw.write(((ctx.getChild(0).toString()) + " "));
            
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}