@java.lang.Override
protected won.bot.framework.eventbot.event.impl.command.MessageCommandSuccessEvent createRemoteNodeSuccessEvent(won.bot.framework.eventbot.event.impl.command.feedback.FeedbackCommandEvent originalCommand, won.protocol.message.WonMessage messageSent, won.bot.framework.eventbot.event.impl.wonmessage.SuccessResponseEvent successResponseEvent) {
    return new won.bot.framework.eventbot.event.impl.command.feedback.FeedbackCommandSuccessEvent(originalCommand, successResponseEvent.getNeedURI(), successResponseEvent.getRemoteNeedURI(), successResponseEvent.getConnectionURI());
}