@java.lang.Override
public boolean handlesRequest(java.lang.String request) {
    return (((request.equals("")) || (request.equals("/"))) || (request.equals(server.getBasePath()))) || (request.equals(((server.getBasePath()) + "/")));
}