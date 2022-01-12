private void checkNameConsistency(com.google.gwt.dev.jjs.ast.JMember member) {
    if (member instanceof com.google.gwt.dev.jjs.ast.JMethod) {
        java.lang.String jsName = member.getJsName();
        for (com.google.gwt.dev.jjs.ast.JMethod jMethod : ((com.google.gwt.dev.jjs.ast.JMethod) (member)).getOverriddenMethods()) {
            java.lang.String parentName = jMethod.getJsName();
            if ((parentName != null) && (!(parentName.equals(jsName)))) {
                logError(member, "%s cannot be assigned a different JavaScript name than the method it overrides.", getMemberDescription(member));
                break;
            }
        }
    }
}