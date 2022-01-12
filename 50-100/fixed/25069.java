@org.junit.Before
public void setup() throws java.lang.Exception {
    org.glassfish.jersey.server.ResourceConfig rc = new org.glassfish.jersey.server.ResourceConfig();
    cube = new org.cubedb.core.MultiCubeImpl(null);
    rc.registerInstances(new org.cubedb.api.resources.CubeResource(cube));
    httpServer = org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory.createHttpServer(com.badoo.cube.api.resources.CubeResourceGeneralTest.baseUri, rc);
    httpServer.start();
    javax.ws.rs.client.Client client = javax.ws.rs.client.ClientBuilder.newClient();
    webTarget = client.target(com.badoo.cube.api.resources.CubeResourceGeneralTest.baseUri);
}