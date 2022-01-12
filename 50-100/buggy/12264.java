private void setPostParameters(java.lang.String namespace, java.lang.String command, org.cytoscape.command.AvailableCommands available, io.swagger.models.Operation operation) {
    io.swagger.models.parameters.BodyParameter parameter = new io.swagger.models.parameters.BodyParameter();
    parameter.setName("body");
    org.cytoscape.rest.internal.resource.CyRESTCommandSwagger.CommandModel model = new org.cytoscape.rest.internal.resource.CyRESTCommandSwagger.CommandModel(namespace, command, available);
    parameter.setRequired((!(model.properties.isEmpty())));
    parameter.setSchema(model);
    operation.addParameter(parameter);
}