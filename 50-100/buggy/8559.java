@org.apache.logging.log4j.core.config.plugins.PluginFactory
public static io.cloudracer.LogMonitor createAppender(@org.apache.logging.log4j.core.config.plugins.PluginAttribute(value = "name")
java.lang.String name, @org.apache.logging.log4j.core.config.plugins.PluginElement(value = "Layout")
org.apache.logging.log4j.core.Layout<?> layout, @org.apache.logging.log4j.core.config.plugins.PluginElement(value = "Filter")
final org.apache.logging.log4j.core.Filter filter, @org.apache.logging.log4j.core.config.plugins.PluginAttribute(value = "otherAttribute")
java.lang.String otherAttribute) {
    if (name == null) {
        io.cloudracer.LOGGER.error("No name provided for TestLog4j2Appender");
        return null;
    }
    if (layout == null) {
        layout = org.apache.logging.log4j.core.layout.PatternLayout.createDefaultLayout();
    }
    io.cloudracer.LogMonitor.setLogMonitor(new io.cloudracer.LogMonitor(name, filter, layout, true));
    return io.cloudracer.LogMonitor.getLogMonitor();
}