private void putLocationAndTeamPropertiesToRabbitmqNodes(net.echinopsii.ariane.community.plugin.rabbitmq.directory.model.RabbitmqCluster cluster) {
    java.util.HashMap<java.lang.String, java.lang.Object> props = new java.util.HashMap<>();
    for (net.echinopsii.ariane.community.plugin.rabbitmq.directory.model.RabbitmqNode rabbitmqNode : cluster.getNodes()) {
        props.putAll(getLocationPropertiesFromOSI(rabbitmqNode.getOsInstance()));
        props.putAll(getTeamPropertiesFromTeam(rabbitmqNode.getSupportTeam()));
        rabbitmqNode.setProperties(props);
    }
}