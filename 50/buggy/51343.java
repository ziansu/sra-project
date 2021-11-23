@java.lang.Override
protected void configureRegistry() {
    bind(supplierTypeLiteral).toRegistry(100, java.util.concurrent.TimeUnit.MICROSECONDS);
}