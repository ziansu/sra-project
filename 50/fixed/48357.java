public static org.ei.opensrp.Context getInstance() {
    if ((org.ei.opensrp.Context.context) == null) {
        org.ei.opensrp.Context.context = new org.ei.opensrp.Context();
    }
    return org.ei.opensrp.Context.context;
}