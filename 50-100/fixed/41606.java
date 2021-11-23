@java.lang.Override
public org.renjin.compiler.ir.tac.expressions.Expression translateToExpression(org.renjin.compiler.ir.tac.IRBodyBuilder builder, org.renjin.compiler.ir.tac.functions.TranslationContext context, org.renjin.sexp.Function resolvedFunction, org.renjin.sexp.FunctionCall call) {
    java.lang.String functionName = ((org.renjin.sexp.PrimitiveFunction) (resolvedFunction)).getName();
    java.util.List<org.renjin.compiler.ir.tac.IRArgument> arguments = builder.translateArgumentList(context, call.getArguments());
    return new org.renjin.compiler.ir.tac.expressions.BuiltinCall(builder.getRuntimeState(), call, functionName, arguments);
}