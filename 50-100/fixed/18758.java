@msi.gama.precompiler.GamlAnnotations.action(name = ummisco.gama.network.common.INetworkSkill.FETCH_MESSAGE, args = {  }, doc = @msi.gama.precompiler.GamlAnnotations.doc(value = "moves the agent towards the target passed in the arguments.", returns = "the path followed by the agent.", examples = { @msi.gama.precompiler.GamlAnnotations.example(value = "do action: goto{\n arg target value: one_of (list (species (self))); \n arg speed value: speed * 2; \n arg on value: road_network;}") }))
public msi.gama.util.GamaMap<java.lang.String, java.lang.String> fetchMessage(final msi.gama.runtime.IScope scope) {
    final msi.gama.metamodel.agent.IAgent agent = getCurrentAgent(scope);
    java.lang.String serverName = ((java.lang.String) (agent.getAttribute(INetworkSkill.NET_AGENT_SERVER)));
    ummisco.gama.network.common.IConnector connector = this.serverList.get(serverName);
    msi.gama.util.GamaMap<java.lang.String, java.lang.String> res = connector.fetchMessageBox(agent);
    return res;
}