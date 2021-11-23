@java.lang.Override
public java.lang.Object invoke(final java.lang.Object[] params) throws java.lang.Exception {
    log.info("Invoke: {} -> {}", java.util.Arrays.asList(params), method);
    return method.invoke(target(), params);
}