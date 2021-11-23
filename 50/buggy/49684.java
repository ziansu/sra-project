@java.lang.Override
public org.jclouds.collect.IterableWithMarker<org.jclouds.dimensiondata.cloudcontrol.domain.OperatingSystem> apply(java.lang.Object input) {
    org.jclouds.dimensiondata.cloudcontrol.options.PaginationOptions paginationOptions = org.jclouds.dimensiondata.cloudcontrol.options.PaginationOptions.class.cast(input);
    return api.getInfrastructureApi().listOperatingSystems(arg.toString(), paginationOptions);
}