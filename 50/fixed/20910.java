private void check(org.kframework.definition.Context context) {
    resetVars();
    gatherVars(context.body());
    check(context.body(), true);
    check(context.requires(), false);
}