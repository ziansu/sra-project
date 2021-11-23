@java.lang.Override
public void enterVariableAssignment(ee.ioc.cs.vsle.parser.generated.SpecificationLanguageParser.VariableAssignmentContext ctx) {
    assignVariable(ctx.variableIdentifier().getText(), ctx.variableAssigner().getText());
}