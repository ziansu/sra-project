@java.lang.Override
public void decorateResponse(io.mikesir87.javacors.ResponseHandler responseHandler, io.mikesir87.javacors.validators.CorsRequestContext requestContext, io.mikesir87.javacors.CorsConfiguration configuration) {
    if (((!(requestContext.isPreFlightRequest())) && ((configuration.getExposedHeaders()) != null)) && ((configuration.getExposedHeaders().size()) >= 1)) {
        responseHandler.addHeader(io.mikesir87.javacors.decorators.ExposeHeadersResponseDecorator.HEADER_NAME, java.lang.String.join(", ", configuration.getExposedHeaders()));
    }
}