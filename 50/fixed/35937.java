@java.lang.Override
public <T> T invokePlugin(java.lang.String id, java.lang.String method, java.lang.Object... args) {
    return invoke("invokePlugin", java.lang.String.class, java.lang.String.class, java.lang.Object[].class).with(id, method, args);
}