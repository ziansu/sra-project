public static org.n52.io.request.IoParameters createFromQuery(org.n52.io.request.RequestParameterSet parameters) {
    return new org.n52.io.request.IoParameters(org.n52.io.request.IoParameters.createQueryParametersFrom(parameters));
}