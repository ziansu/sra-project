@$.GET
@$.Path(value = "hello")
@$.Produces(value = javax.ws.rs.core.MediaType.TEXT_PLAIN)
public java.lang.String hello() throws co.paralleluniverse.fibers.SuspendExecution, java.lang.InterruptedException {
    return "Hello world!";
}