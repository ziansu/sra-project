private void check(org.kframework.definition.Rule rule) {
    if (rule.att().contains("unblock"))
        return ;
    
    resetVars();
    gatherVars(rule.body());
    check(rule.body(), true);
    check(rule.requires(), false);
    check(rule.ensures(), false);
}