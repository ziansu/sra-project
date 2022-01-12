private static innovimax.mixthem.arguments.Rule findRuleArgument(java.lang.String[] args, int index, java.lang.String name) throws innovimax.mixthem.exceptions.ArgumentException {
    innovimax.mixthem.arguments.Rule rule = null;
    if ((args.length) > index) {
        final java.lang.String ruleString = args[index];
        if (ruleString.startsWith("-")) {
            rule = innovimax.mixthem.arguments.Rule.findByName(ruleString.substring(1));
            if (rule == null) {
                throw new innovimax.mixthem.exceptions.ArgumentException(((name + " argument is incorrect: ") + ruleString));
            }
        }
    }
    return rule;
}