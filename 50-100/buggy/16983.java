@java.lang.Override
public void handle(ch.arrg.javabot.data.BotContext ctx) {
    java.lang.String message = ctx.message;
    if ((currentQuestion) != null) {
        if (message.startsWith("+")) {
            onReply(ctx);
        }
    }
    if (ch.arrg.javabot.util.CommandMatcher.make(getQuizName()).matches(message)) {
        onCommand(ctx);
    }
}