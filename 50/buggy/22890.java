@net.e6tech.sample.web.cxf.POST
@net.e6tech.sample.web.cxf.Produces(value = { javax.ws.rs.core.MediaType.APPLICATION_JSON })
@net.e6tech.sample.web.cxf.Path(value = "hello")
public net.e6tech.sample.web.cxf.HelloData post(net.e6tech.sample.web.cxf.HelloData data) {
    return data;
}