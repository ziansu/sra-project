private static void isValidUrl(java.net.URI webAddress) {
    java.lang.String[] schemes = new java.lang.String[]{ "http" , "https" };
    org.apache.commons.validator.routines.UrlValidator urlValidator = new org.apache.commons.validator.routines.UrlValidator(schemes);
    if (!(urlValidator.isValid(java.lang.String.valueOf(webAddress))))
        throw new biocode.fims.fimsExceptions.BadRequestException("Invalid URL for bcid webAddress");
    
}