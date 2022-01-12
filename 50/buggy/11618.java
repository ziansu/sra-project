public java.lang.String getNextUrl() {
    return apiResponse.getLinks().get("next").getHref();
}