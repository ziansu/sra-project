@org.junit.Test
public void testEmptyAssemblyConfig() {
    io.fabric8.maven.docker.assembly.DockerAssemblyConfigurationSource source = new io.fabric8.maven.docker.assembly.DockerAssemblyConfigurationSource(new io.fabric8.maven.docker.util.MojoParameters(null, null, null, null, null, null, "/src/docker", "/output/docker"), null, null);
    org.junit.Assert.assertEquals(0, source.getDescriptors().length);
}