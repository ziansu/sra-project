@java.lang.Override
public void endVisit(com.google.gwt.dev.jjs.ast.JMethodCall x, com.google.gwt.dev.jjs.ast.Context ctx) {
    com.google.gwt.dev.jjs.ast.JMethod target = x.getTarget();
    if ((x.isStaticDispatchOnly()) && (target.getJsMemberType().isPropertyAccessor())) {
        logError(x, "Cannot call property accessor %s via super.", com.google.gwt.dev.jjs.impl.JsInteropRestrictionChecker.getMemberDescription(target));
    }
}