@java.lang.Override
public void enterParameterDecl(edu.clemson.cs.rsrg.parsing.ResolveParser.ParameterDeclContext ctx) {
    if ((ctx.variableDeclGroup().programArrayType()) != null) {
        throw new edu.clemson.cs.rsrg.errorhandling.exception.SourceErrorException("Array types cannot be used as a type for the parameter variables", createPosSymbol(ctx.variableDeclGroup().start), new java.lang.IllegalArgumentException());
    }
}