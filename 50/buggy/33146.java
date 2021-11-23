@java.lang.SafeVarargs
public final com.jenjinstudios.io.connection.ConnectionBuilder<T> withContextualTasks(java.util.function.Consumer<T>... callbacks) {
    java.util.Collections.addAll(contextualTasks, callbacks);
    return this;
}