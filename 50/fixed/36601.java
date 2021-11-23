protected void registerNamespaceDispatcher(java.lang.String namespace) {
    namespaceDispatchers.put(namespace, new org.codehaus.groovy.grails.web.taglib.NamespacedTagDispatcher(namespace, org.codehaus.groovy.grails.web.pages.GroovyPage.class, grailsApplication, this));
}