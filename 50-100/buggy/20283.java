public org.springframework.integration.dsl.EnricherSpec subFlow(org.springframework.integration.dsl.IntegrationFlow subFlow) {
    org.springframework.util.Assert.notNull(subFlow, "'subFlow' must not be null");
    org.springframework.integration.channel.DirectChannel requestChannel = new org.springframework.integration.channel.DirectChannel();
    org.springframework.integration.dsl.IntegrationFlowBuilder flowBuilder = org.springframework.integration.dsl.IntegrationFlows.from(requestChannel);
    subFlow.configure(flowBuilder);
    this.componentsToRegister.add(flowBuilder);
    return _this().requestChannel(requestChannel);
}