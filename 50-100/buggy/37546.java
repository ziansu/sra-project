@java.lang.Override
public org.apache.beam.sdk.values.PCollection<T> apply(final org.apache.beam.sdk.values.PCollection<T> col) {
    col.apply(org.apache.beam.sdk.transforms.ParDo.named("Debug.Do").of(new org.apache.beam.sdk.transforms.DoFn<T, T>() {
        @java.lang.Override
        public void processElement(final org.apache.beam.contrib.transforms.ProcessContext c) {
            final T elem = c.element();
            if (predicate.apply(elem)) {
                fun.apply(elem);
            }
            c.output(elem);
        }
    }));
    return col;
}