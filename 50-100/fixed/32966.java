public void appendResponse(com.twilio.survey.models.Response response) {
    if (!(this.isDone())) {
        this.responses[((index)++)] = response;
        if ((index) > (Server.config.getQuestions().length)) {
            this.markDone();
        }
    }
}