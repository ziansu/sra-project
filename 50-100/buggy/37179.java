@org.junit.Ignore
public void testKnapsackResource() throws java.io.IOException {
    parameters.Problem problem = new parameters.Problem(3423413, null);
    javax.ws.rs.client.Client client = org.mockito.Mockito.mock(javax.ws.rs.client.Client.class);
    resources.ClientBuilder builder = org.mockito.Mockito.mock(resources.ClientBuilder.class);
    org.mockito.Mockito.when(builder.buildClient(environment, configuration)).thenReturn(client);
    resources.KnapsackClientResource clientResourceReal = new resources.KnapsackClientResource(environment, configuration, builder);
    parameters.Solution solution = clientResourceReal.call(problem);
}