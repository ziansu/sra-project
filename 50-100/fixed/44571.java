@org.junit.Test
public void testUpdateCheck() throws java.lang.Exception {
    com.gentics.mesh.Mesh mesh = new com.gentics.mesh.impl.MeshFactoryImpl().mesh();
    ((com.gentics.mesh.cli.MeshImpl) (mesh)).setVertx(io.vertx.core.Vertx.vertx());
    ((com.gentics.mesh.cli.MeshImpl) (mesh)).invokeUpdateCheck();
}