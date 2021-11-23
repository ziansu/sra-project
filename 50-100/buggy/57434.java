java.lang.String buildQuery(java.lang.String street, java.lang.String postalCode, java.lang.String city, java.lang.String name) {
    java.lang.StringBuilder queryBuilder = new java.lang.StringBuilder();
    appendStringWithSeparatorIfHasText(queryBuilder, street, ",");
    appendStringWithSeparatorIfHasText(queryBuilder, postalCode, net.contargo.iris.address.nominatim.service.NominatimUrlBuilder.WHITESPACE);
    appendStringWithSeparatorIfHasText(queryBuilder, city, net.contargo.iris.address.nominatim.service.NominatimUrlBuilder.WHITESPACE);
    appendStringWithSeparatorIfHasText(queryBuilder, name, net.contargo.iris.address.nominatim.service.NominatimUrlBuilder.WHITESPACE);
    java.lang.String query = queryBuilder.toString();
    java.lang.String encodedUrl = encodeUrl(query);
    return encodedUrl == null ? query : encodedUrl;
}