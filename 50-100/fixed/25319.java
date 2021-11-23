@org.junit.Test
public void decompressorRegistry_null() {
    io.grpc.DecompressorRegistry defaultValue = builder.decompressorRegistry;
    org.junit.Assert.assertEquals(builder, builder.decompressorRegistry(io.grpc.DecompressorRegistry.emptyInstance()));
    assertNotEquals(defaultValue, builder.decompressorRegistry);
    builder.decompressorRegistry(null);
    org.junit.Assert.assertEquals(defaultValue, builder.decompressorRegistry);
}