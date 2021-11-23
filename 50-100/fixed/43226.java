public uk.nickbdyer.httpserver.responses.Response route(uk.nickbdyer.httpserver.requests.Request request) {
    if (publicFileExists(request.getPath())) {
        routeTable.put(request.getPath(), new uk.nickbdyer.httpserver.controllers.FileController(getFile(request.getPath())));
    }
    if (!(routeTable.containsKey(request.getPath()))) {
        return uk.nickbdyer.httpserver.responses.Response.NotFound();
    }else {
        return routeTable.get(request.getPath()).execute(request);
    }
}