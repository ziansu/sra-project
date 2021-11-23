private void assertMeasurements(java.util.function.Supplier<?> myClassSupplier) {
    long actual = sizeMeasurementTool.measure(myClassSupplier.get()).getTotalSize();
    long expected = ru.otus.homework02.CustomSizeMeasurer.measure(myClassSupplier);
    org.assertj.core.api.Assertions.assertThat(expected).isEqualTo(actual);
}