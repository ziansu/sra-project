@java.lang.Override
public java.util.List<org.apache.wicket.markup.head.HeaderItem> getDependencies() {
    java.util.List<org.apache.wicket.markup.head.HeaderItem> dependencies = super.getDependencies();
    dependencies.add(org.apache.wicket.markup.head.JavaScriptHeaderItem.forReference(new org.apache.wicket.request.resource.JavaScriptResourceReference(de.agilecoders.wicket.extensions.markup.html.bootstrap.markdown.MarkdownJsResourceReference.class, "res/js/markdown.js")));
    dependencies.add(org.apache.wicket.markup.head.JavaScriptHeaderItem.forReference(new org.apache.wicket.request.resource.JavaScriptResourceReference(de.agilecoders.wicket.extensions.markup.html.bootstrap.markdown.MarkdownJsResourceReference.class, "res/js/to-markdown.js")));
    return dependencies;
}