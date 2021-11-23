@java.lang.Override
public void completed(javax.ws.rs.core.Response response) {
    javax.ws.rs.core.Link next = response.getLink("next");
    java.lang.String message = response.readEntity(java.lang.String.class);
    java.lang.System.out.print(message);
    java.lang.System.out.println();
    java.lang.System.out.print((username + " > "));
    client.target(next).request().async().get(this);
}