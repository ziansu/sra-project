@Parameterized.Parameters(name = "runner = {1}")
public static java.util.Collection<java.lang.Object[]> constructorFeeder() {
    return com.google.common.collect.ImmutableList.of(new java.lang.Object[]{ io.druid.query.metadata.SegmentMetadataQueryTest.makeMMappedQueryRunner(io.druid.query.metadata.SegmentMetadataQueryTest.FACTORY) , "mmap" , true }, new java.lang.Object[]{ io.druid.query.metadata.SegmentMetadataQueryTest.makeIncrementalIndexQueryRunner(io.druid.query.metadata.SegmentMetadataQueryTest.FACTORY) , "incremental" , false });
}