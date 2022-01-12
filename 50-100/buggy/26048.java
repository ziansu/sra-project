private void checkSendMail() {
    if ((this.configuration.getSendMailUpdates()) && ((this.configuration.getSmtpSendEmailOnSuccess()) || ((this.orchestratorStatus.getTotalSubmitted()) != (this.orchestratorStatus.getTotalSuccess())))) {
        reporter.send();
    }
}