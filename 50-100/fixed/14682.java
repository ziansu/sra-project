public static io.druid.query.IntervalChunkingQueryRunnerDecorator NoopIntervalChunkingQueryRunnerDecorator() {
    return new io.druid.query.IntervalChunkingQueryRunnerDecorator(null, null, null) {
        @java.lang.Override
        public <T> io.druid.query.QueryRunner<T> decorate(final io.druid.query.QueryRunner<T> delegate, io.druid.query.QueryToolChest<T, ? extends io.druid.query.Query<T>> toolChest) {
            return new io.druid.query.QueryRunner<T>() {
                @java.lang.Override
                public com.metamx.common.guava.Sequence<T> run(io.druid.query.Query<T> query, java.util.Map<java.lang.String, java.lang.Object> responseContext) {
                    return delegate.run(query, responseContext);
                }
            };
        }
    };
}