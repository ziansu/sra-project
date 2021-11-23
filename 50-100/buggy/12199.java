@java.lang.Override
public io.dropwizard.auth.AuthFactory<java.lang.Object, T> clone(boolean required) {
    io.dropwizard.auth.ChainedAuthFactory<T> clone = new io.dropwizard.auth.ChainedAuthFactory<>();
    for (io.dropwizard.auth.AuthFactory<?, T> factory : factories) {
        clone.addChainedProvider(factory.clone(true));
    }
    return clone;
}