private io.javadog.cws.core.Servicable<io.javadog.cws.api.responses.FetchCircleResponse, io.javadog.cws.api.requests.FetchCircleRequest> prepareService() {
    return new io.javadog.cws.core.services.FetchCirclesService(settings, entityManager);
}