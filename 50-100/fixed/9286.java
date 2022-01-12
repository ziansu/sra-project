public static backtype.storm.generated.StormTopology buildTopology(org.apache.storm.flux.ExecutionContext context) throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
    org.apache.storm.flux.TopologyBuilder builder = new org.apache.storm.flux.TopologyBuilder();
    org.apache.storm.flux.FluxBuilder.buildComponents(context);
    org.apache.storm.flux.FluxBuilder.buildSpouts(context, builder);
    org.apache.storm.flux.FluxBuilder.buildBolts(context);
    org.apache.storm.flux.FluxBuilder.buildStreamDefinitions(context, builder);
    return builder.createTopology();
}