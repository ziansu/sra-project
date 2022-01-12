public void markPartial(java.lang.String caller) {
    this.caller = caller;
    this.status = net.bubbaland.trivia.Answer.Status.PARTIAL;
}