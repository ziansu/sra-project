public uk.nickbdyer.httpserver.responses.Response route(uk.nickbdyer.httpserver.requests.Request request) {
    java.lang.String requestPath = request.getPath();
    if (publicFileExists(requestPath)) {
        routeTable.put(requestPath, new uk.nickbdyer.httpserver.controllers.FileController(getFile(requestPath)));
    }
    if (!(routeTable.containsKey(requestPath))) {
        return uk.nickbdyer.httpserver.responses.Response.NotFound();
    }else {
        return routeTable.get(requestPath).execute(request);
    }
}