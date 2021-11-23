@org.junit.Test
public void compressorRegistry_null() {
    io.grpc.CompressorRegistry defaultValue = builder.compressorRegistry;
    builder.compressorRegistry(io.grpc.CompressorRegistry.newEmptyInstance());
    org.junit.Assert.assertNotEquals(defaultValue, builder.compressorRegistry);
    org.junit.Assert.assertEquals(builder, builder.compressorRegistry(null));
    org.junit.Assert.assertEquals(defaultValue, builder.compressorRegistry);
}