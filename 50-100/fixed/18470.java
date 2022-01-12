private <T extends com.google.gwt.dev.jjs.ast.HasType & com.google.gwt.dev.jjs.ast.CanHaveSuppressedWarnings> void logIfUnusableByJs(T hasType, java.lang.String prefix, com.google.gwt.dev.jjs.ast.JMember x) {
    if (hasType.getType().canBeReferencedExternally()) {
        return ;
    }
    if (((isUnusableByJsSuppressed(x.getEnclosingType())) || (isUnusableByJsSuppressed(x))) || (isUnusableByJsSuppressed(hasType))) {
        return ;
    }
    logWarning(x, "[unusable-by-js] %s %s is not usable by but exposed to JavaScript.", prefix, getMemberDescription(x));
}