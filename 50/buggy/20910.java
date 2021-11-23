private void check(org.kframework.definition.Context context) {
    resetVars();
    gatherVars(context.body());
    gatherVars(context.requires());
    check(context.body());
    check(context.requires());
}