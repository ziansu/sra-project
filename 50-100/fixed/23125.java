public static java.util.Properties convertParamsToProperties(final java.util.List<it.infn.ct.futuregateway.apiserver.resources.Params> params, final java.util.Properties properties) {
    java.util.Properties pr = properties;
    for (it.infn.ct.futuregateway.apiserver.resources.Params par : params) {
        java.lang.Object previous = pr.setProperty(par.getName(), par.getValue());
        if (previous != null) {
            pr.setProperty(par.getName(), (((par.getValue()) + ",") + previous));
        }
    }
    return pr;
}