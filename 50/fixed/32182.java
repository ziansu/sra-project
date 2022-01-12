protected com.abiquo.api.exceptions.APIException translateException(final java.lang.Exception e) {
    if (e instanceof com.abiquo.api.exceptions.APIException) {
        return ((com.abiquo.api.exceptions.APIException) (e));
    }
    return new com.abiquo.api.exceptions.ConflictException(com.abiquo.api.exceptions.APIError.NODECOLLECTOR_ERROR);
}