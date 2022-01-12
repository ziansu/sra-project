protected org.n52.sos.util.http.MediaType chooseResponseContentTypeForExceptionReport(java.util.List<org.n52.sos.util.http.MediaType> acceptHeader, org.n52.sos.util.http.MediaType defaultContentType) throws org.n52.sos.exception.HTTPException {
    if (acceptHeader.isEmpty()) {
        return defaultContentType;
    }
    for (org.n52.sos.util.http.MediaType mt : acceptHeader) {
        org.n52.sos.util.http.MediaType mediaType = mt.withoutParameter(org.n52.sos.binding.SimpleBinding.QUALITY);
        if (defaultContentType.isCompatible(mediaType)) {
            return defaultContentType;
        }else
            if (hasEncoder(new org.n52.sos.encode.ExceptionEncoderKey(mediaType))) {
                return mediaType;
            }
        
    }
    throw new org.n52.sos.exception.HTTPException(org.n52.sos.util.http.HTTPStatus.NOT_ACCEPTABLE);
}