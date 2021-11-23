private boolean processMethodExtension(pa.iscde.javadoc.export.render.JavaDocMethodRender jRender, org.eclipse.jdt.core.dom.MethodDeclaration mDeclaration, java.lang.StringBuilder sb) {
    final java.lang.StringBuilder sbExtension = new java.lang.StringBuilder();
    final boolean completed = jRender.render(mDeclaration, sb);
    if ((sbExtension.length()) > 0) {
        sb.append(sbExtension);
    }
    return completed;
}