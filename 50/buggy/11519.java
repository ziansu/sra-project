private static final java.util.function.Supplier<java.lang.String> resolve(final java.util.function.Supplier<? extends java.lang.CharSequence> supplier) {
    return supplier == null ? null : org.j8unit.Assert.supply(supplier.get());
}