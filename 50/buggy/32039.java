public static main.stepicConnector.StepicConnector.AuthorWrapper getCurrentUser(java.lang.String token) {
    try {
        return main.stepicConnector.StepicConnector.getFromStepic("stepics/1", main.stepicConnector.StepicConnector.AuthorWrapper.class, token);
    } catch (com.mashape.unirest.http.exceptions.UnirestException e) {
        main.stepicConnector.StepicConnector.LOG.error("Couldn't get author info");
    }
    return null;
}