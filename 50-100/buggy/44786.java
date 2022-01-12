@java.lang.Deprecated
protected java.lang.String renderComponent(final java.util.concurrent.Callable<org.apache.wicket.Component> componentTask, java.util.Locale locale) {
    return renderComponent(new com.google.common.base.Supplier<org.apache.wicket.Component>() {
        @java.lang.Override
        public org.apache.wicket.Component get() {
            try {
                return componentTask.call();
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e);
            }
        }
    }, locale);
}