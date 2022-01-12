@org.apache.logging.log4j.core.config.plugins.PluginFactory
public static org.spongepowered.server.launch.console.TerminalConsoleAppender createAppender(@org.apache.logging.log4j.core.config.plugins.PluginAttribute(value = "name")
java.lang.String name, @org.apache.logging.log4j.core.config.plugins.PluginElement(value = "Filters")
org.apache.logging.log4j.core.Filter filter, @org.apache.logging.log4j.core.config.plugins.PluginElement(value = "Layout")
@javax.annotation.Nullable
org.apache.logging.log4j.core.Layout<? extends java.io.Serializable> layout, @org.apache.logging.log4j.core.config.plugins.PluginAttribute(value = "ignoreExceptions")
java.lang.String ignore) {
    if (name == null) {
        org.spongepowered.server.launch.console.LOGGER.error("No name provided for TerminalConsoleAppender");
        return null;
    }
    if (layout == null) {
        layout = org.apache.logging.log4j.core.layout.PatternLayout.createLayout(null, null, null, null, null, true, false, null, null);
    }
    boolean ignoreExceptions = org.apache.logging.log4j.core.util.Booleans.parseBoolean(ignore, true);
    return new org.spongepowered.server.launch.console.TerminalConsoleAppender(name, filter, layout, ignoreExceptions);
}