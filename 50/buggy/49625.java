@java.lang.Override
protected <T extends java.lang.Number> com.bazaarvoice.jolt.common.Optional<T> convert(final java.lang.Object o) {
    return ((com.bazaarvoice.jolt.common.Optional) (com.bazaarvoice.jolt.modifier.function.Math.abs(o)));
}