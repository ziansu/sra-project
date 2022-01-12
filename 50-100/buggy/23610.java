@org.junit.Test
public void testFetchNoContent() throws com.fasterxml.jackson.core.JsonProcessingException, net.nuagenetworks.bambou.RestException {
    startSession(restOperations, "object/childobject", HttpMethod.GET, HttpStatus.OK, null, null);
    net.nuagenetworks.bambou.testobj.TestObject object = new net.nuagenetworks.bambou.testobj.TestObject();
    net.nuagenetworks.bambou.testobj.TestChildObjectFetcher fetcher = new net.nuagenetworks.bambou.testobj.TestChildObjectFetcher(object);
    java.util.List<net.nuagenetworks.bambou.testobj.TestChildObject> childObjects = fetcher.fetch();
    org.junit.Assert.assertEquals(0, childObjects.size());
}