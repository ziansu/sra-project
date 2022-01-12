@org.junit.Test
public void testNullMaterial() {
    br.odb.liboldfart.WavefrontOBJLoader loader = new br.odb.liboldfart.WavefrontOBJLoader(new br.odb.libstrip.builders.GeneralTriangleFactory());
    java.util.List<br.odb.libstrip.GeneralTriangleMesh> mesh = loader.loadMeshes(inputStreamFromString(model1), null);
    junit.framework.Assert.assertEquals(1, mesh.size());
    junit.framework.Assert.assertEquals("test", mesh.get(0).name);
    mesh = loader.loadMeshes(null, null);
    junit.framework.Assert.assertEquals(0, mesh.size());
}