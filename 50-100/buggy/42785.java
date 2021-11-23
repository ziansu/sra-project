@org.junit.Test
public void noProvider() {
    java.lang.ClassLoader cl = new io.grpc.ReplacingClassLoader(getClass().getClassLoader(), serviceFile, "io/grpc/NameResolverProviderTest-doesNotExist.txt");
    java.util.List<io.grpc.NameResolverProvider> providers = io.grpc.NameResolverProvider.load(cl);
    org.junit.Assert.assertEquals(java.util.Collections.<io.grpc.NameResolverProvider>emptyList(), providers);
    org.junit.Assert.assertEquals("noproviders", io.grpc.NameResolverProvider.asFactory(providers).getDefaultScheme());
    org.junit.Assert.assertNull(null, io.grpc.NameResolverProvider.asFactory(providers).newNameResolver(uri, attributes));
}