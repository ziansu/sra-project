public java.lang.String getDetails() {
    net.masterthought.cucumber.json.support.Status status = getStatus();
    java.lang.String errorMessage = null;
    switch (status) {
        case FAILED :
            errorMessage = result.getErrorMessage();
            return getStatusDetails(status, errorMessage);
        case MISSING :
            errorMessage = "<span class=\"missing\">Result was missing for this step</span>";
            return getStatusDetails(status, errorMessage);
        default :
            return getStatusDetails(status, errorMessage);
    }
}