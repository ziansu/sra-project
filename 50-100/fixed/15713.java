protected org.n52.sos.util.http.MediaType chooseResponseContentTypeForExceptionReport(java.util.List<org.n52.sos.util.http.MediaType> acceptHeader, org.n52.sos.util.http.MediaType defaultContentType) {
    if (acceptHeader.isEmpty()) {
        return defaultContentType;
    }else {
        for (org.n52.sos.util.http.MediaType mt : acceptHeader) {
            org.n52.sos.util.http.MediaType mediaType = mt.withoutParameter(org.n52.sos.binding.SimpleBinding.QUALITY);
            if (hasEncoder(new org.n52.sos.encode.ExceptionEncoderKey(mediaType))) {
                return mediaType;
            }
        }
        return defaultContentType;
    }
}