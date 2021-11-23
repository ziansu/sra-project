@java.lang.Override
public org.statefulj.fsm.model.StateActionPair<com.example.bot.spring.amazon.bot.Conversation> getStateActionPair(com.example.bot.spring.amazon.bot.Conversation c, java.lang.String event, java.lang.Object... args) throws org.statefulj.fsm.RetryException {
    if (c.getLastInput().getText().equalsIgnoreCase("Hi Amazon")) {
        return goToHello;
    }else
        if (c.getLastInput().getText().equalsIgnoreCase("Join Prime")) {
            c.addResponse(com.example.bot.spring.amazon.model.BotActionResponse.of("Free one day shipping if you join Prime"));
            return goToJoinPrime;
        }else {
            c.addResponse(com.example.bot.spring.amazon.model.BotActionResponse.of("I didn't quite get that."));
            return goToHello;
        }
    
}