@org.junit.jupiter.api.Test
public void post() {
    net.e6tech.sample.web.cxf.HelloData data = new net.e6tech.sample.web.cxf.HelloData();
    data = helloWorld.post(data);
    org.junit.jupiter.api.Assertions.assertThrows(javax.ws.rs.BadRequestException.class, () -> helloWorld.post(null));
    org.junit.jupiter.api.Assertions.assertThrows(javax.ws.rs.BadRequestException.class, () -> helloWorld.badPost(new net.e6tech.sample.web.cxf.HelloData()));
}