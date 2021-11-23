private void check(org.kframework.definition.Rule rule) {
    if (rule.att().contains("unblock"))
        return ;
    
    resetVars();
    gatherVars(rule.body());
    gatherVars(rule.requires());
    gatherVars(rule.ensures());
    check(rule.body());
    check(rule.requires());
    check(rule.ensures());
}