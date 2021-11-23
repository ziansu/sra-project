@java.lang.Override
public org.elasticsearch.plugin.readonlyrest.acl.blocks.rules.RuleExitResult match(org.elasticsearch.plugin.readonlyrest.acl.RequestContext rc) {
    java.lang.String h = org.elasticsearch.plugin.readonlyrest.acl.blocks.rules.impl.ProxyAuthRule.getUser(rc.getHeaders());
    if (h == null) {
        return NO_MATCH;
    }
    if ((h.length()) == 0) {
        return NO_MATCH;
    }
    for (java.lang.String user : userList) {
        if (user.equals("*")) {
            return MATCH;
        }
        if (user.equals(h)) {
            return MATCH;
        }
    }
    return NO_MATCH;
}