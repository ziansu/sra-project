@java.lang.Override
public gen.Klass visitParameterList(@org.antlr.v4.runtime.misc.NotNull
gen.MinijavaParser.ParameterListContext ctx) {
    java.util.List<gen.Klass> parameterList = new java.util.ArrayList<gen.Klass>();
    int paramCount = 0;
    for (gen.MinijavaParser.ParameterContext paramCtx : ctx.parameter()) {
        ctx.setPath((((ctx.getParent().getPath()) + "/Param") + paramCount));
        parameterList.add(visit(paramCtx));
        paramCount++;
    }
    return null;
}