public java.lang.String getNextUrl() {
    if ((apiResponse.getLinks().get("next")) != null)
        return apiResponse.getLinks().get("next").getHref();
    
    return null;
}