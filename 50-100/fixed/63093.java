private void assertMeasurements(java.util.function.Supplier<?> myClassSupplier) {
    long expected = sizeMeasurementTool.measure(myClassSupplier.get()).getTotalSize();
    long actual = ru.otus.homework02.CustomSizeMeasurer.measure(myClassSupplier);
    org.assertj.core.api.Assertions.assertThat(actual).isEqualTo(expected);
}