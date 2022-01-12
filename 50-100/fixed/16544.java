private java.lang.String getSnapFileName(cloudservices.brokerage.crawler.crawlingcommons.model.enums.v3.ServiceDescriptionType type, java.lang.Long snapshotId) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append(snapshotId);
    sb.append(".");
    switch (type) {
        case REST :
            sb.append("html");
            break;
        case WADL :
            sb.append("wadl");
            break;
        case WSDL :
            sb.append("wsdl");
            break;
    }
    return sb.toString();
}