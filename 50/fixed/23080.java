public net.gpedro.integrations.slack.SlackMessage removeAttachment(int index) {
    if ((this.attach) != null) {
        this.attach.remove(index);
    }
    return this;
}