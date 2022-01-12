private void checkMemberQualifiedJsName(com.google.gwt.dev.jjs.ast.JMember member) {
    if (member instanceof com.google.gwt.dev.jjs.ast.JConstructor) {
        return ;
    }
    checkJsName(member);
    if (member.getJsNamespace().equals(member.getEnclosingType().getQualifiedJsName())) {
        return ;
    }
    if (member.needsDynamicDispatch()) {
        logError(member, "Instance member %s cannot declare a namespace.", com.google.gwt.dev.jjs.impl.JsInteropRestrictionChecker.getMemberDescription(member));
        return ;
    }
    checkJsNamespace(member);
}