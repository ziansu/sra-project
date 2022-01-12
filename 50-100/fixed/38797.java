@java.lang.Override
public void enterAssignmentOperator(jshinter.antlr.ECMAScriptParser.AssignmentOperatorContext ctx) {
    org.antlr.v4.runtime.Token t = ctx.getStart();
    int type = t.getType();
    if ((type >= 45) && (type <= 50)) {
        reportError(java.lang.String.format("Unexpected use of '%s'", t.getText()), t);
    }
}