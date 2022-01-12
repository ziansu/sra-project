public java.lang.String print(java.lang.Integer number) {
    java.lang.String reply = Utils.Constants.FizzBuzzConstants.INVALID_NUMBER;
    if (rules.isEmpty()) {
        reply = defaultRule.printReply(number);
    }
    for (Utils.RuleReplyStrategy rule : rules) {
        if (rule.isApplicable(number)) {
            reply = rule.printReply(number);
        }
    }
    return reply;
}