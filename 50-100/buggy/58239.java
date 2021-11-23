public void addRule(com.sixsq.slipstream.acl.TypePrincipalRight rule) {
    com.sixsq.slipstream.acl.TypePrincipal.PrincipalType type = rule.getType();
    java.lang.String principal = rule.getPrincipal();
    boolean duplicate = false;
    for (com.sixsq.slipstream.acl.TypePrincipalRight r : rules) {
        if (((r.getType()) == type) && ((r.getPrincipal()) == principal)) {
            duplicate = true;
            break;
        }
    }
    if (!duplicate) {
        rules.add(rule);
    }
}