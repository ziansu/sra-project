public org.intellij.lang.xpath.psi.XPathVariable resolve(final org.intellij.lang.xpath.psi.XPathVariableReference reference) {
    return ((org.intellij.lang.xpath.psi.XPathVariable) (com.intellij.psi.impl.source.resolve.ResolveCache.getInstance(reference.getProject()).resolveWithCaching(reference, RESOLVER, false, false)));
}