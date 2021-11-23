@java.lang.Override
public T provide() {
    if ((type) != null) {
        java.util.function.Supplier<T> supplier = locator.getService(type, name);
        T instance = supplier.get();
        if (disposable) {
            disposableSuppliers.put(instance, ((org.glassfish.jersey.internal.inject.DisposableSupplier<T>) (supplier)));
        }
        return instance;
    }else {
        return null;
    }
}