public org.ballerinalang.model.values.BValue[] execute(org.ballerinalang.bre.Context ctx) {
    org.ballerinalang.model.values.BDataTable dataTable = ((org.ballerinalang.model.values.BDataTable) (getRefArgument(ctx, 0)));
    java.lang.String rootWrapper = null;
    java.lang.String rowWrapper = null;
    rootWrapper = getStringArgument(ctx, 0);
    rowWrapper = getStringArgument(ctx, 0);
    return getBValues(dataTable.toXML(rootWrapper, rowWrapper, ctx.isInTransaction()));
}