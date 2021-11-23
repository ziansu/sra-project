private void addRestResourceClasses(java.util.Set<java.lang.Class<?>> resources) {
    resources.add(Rest.AllFlightsResource.class);
    resources.add(Rest.ExceptionResource.class);
    resources.add(Rest.FlightsResource.class);
    resources.add(Rest.LoginResource.class);
    resources.add(Rest.ReservationResource.class);
    resources.add(Rest.UserdataResource.class);
    resources.add(RestException.FlightExceptionMapper.class);
    resources.add(RestException.GenericExceptionMapper.class);
    resources.add(RestException.NotFoundExceptionMapper.class);
}