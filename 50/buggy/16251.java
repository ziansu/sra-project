protected final java.lang.String ruleLeft(java.lang.String rule) {
    java.lang.String name = rule;
    if ((rule.indexOf(invar.InvarWrite.GENERIC_LEFT)) >= 0) {
        name = rule.substring(0, rule.indexOf(invar.InvarWrite.GENERIC_LEFT));
    }
    return name;
}