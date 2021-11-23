private org.nesty.core.httpserver.rest.controller.URLController findController() {
    org.nesty.core.httpserver.rest.URLResource resource = org.nesty.core.httpserver.rest.URLResource.fromHttp(httpContext.getUri(), httpContext.getRequestMethod());
    org.nesty.core.httpserver.rest.controller.URLController controller;
    if ((controller = controllerRouter.findURLController(resource)) == null) {
        sendResponse(org.nesty.core.httpserver.rest.response.HttpResponseBuilder.create(httpContext, HttpResponseStatus.NOT_FOUND));
        org.nesty.core.httpserver.HttpServerStats.incrRequestMiss();
        return null;
    }
    if (!(controller.isInternal())) {
        org.nesty.core.httpserver.HttpServerStats.incrRequestHit();
        controller.hit();
    }
    return controller;
}