@java.lang.Override
public final java.util.Enumeration<java.net.URL> findResources(java.lang.String name) throws java.io.IOException {
    final java.util.Collection<java.net.URL> urls = new java.util.ArrayList<>();
    findResources(this, name, urls);
    return de.skuzzle.tinyplugz.ElementIterator.wrap(urls.iterator());
}