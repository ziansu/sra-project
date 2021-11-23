public net.gpedro.integrations.slack.SlackMessage removeAttachment(java.lang.Integer index) {
    if ((this.attach) != null) {
        this.attach.remove(index);
    }
    return this;
}