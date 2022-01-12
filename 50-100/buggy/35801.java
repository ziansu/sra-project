private void checkJsPropertyConsistency(com.google.gwt.dev.jjs.ast.JMember member, com.google.gwt.dev.jjs.impl.JsInteropRestrictionChecker.JsMember newMember) {
    if (((newMember.setter) != null) && ((newMember.getter) != null)) {
        java.util.List<com.google.gwt.dev.jjs.ast.JParameter> setterParams = ((com.google.gwt.dev.jjs.ast.JMethod) (newMember.setter)).getParams();
        if ((newMember.getter.getType()) != (setterParams.get(0).getType())) {
            logError(member, "JsProperty setter %s and getter %s cannot have inconsistent types.", com.google.gwt.dev.jjs.impl.JsInteropRestrictionChecker.getMemberDescription(newMember.setter), com.google.gwt.dev.jjs.impl.JsInteropRestrictionChecker.getMemberDescription(newMember.getter));
        }
    }
}