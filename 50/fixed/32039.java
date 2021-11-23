public static main.stepicConnector.StepicConnector.AuthorWrapper getCurrentUser(java.lang.String token) throws com.mashape.unirest.http.exceptions.UnirestException {
    return main.stepicConnector.StepicConnector.getFromStepic("stepics/1", main.stepicConnector.StepicConnector.AuthorWrapper.class, token);
}