@java.lang.Override
public eu.mihosoft.vrl.lang.model.ElseDeclaration transform(org.codehaus.groovy.ast.stmt.BlockStatement obj, eu.mihosoft.vrl.lang.model.IfDeclaration parent, eu.mihosoft.vrl.instrumentation.transform.TransformContext ctx) {
    if ((parent.getControlFlow().getInvocations().size()) == 1) {
        return builder.invokeElse(((eu.mihosoft.vrl.lang.model.ControlFlowScope) (parent.getParent())));
    }else {
        return null;
    }
}