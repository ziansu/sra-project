public java.util.List<edu.uci.eecs.wukong.framework.model.Component> getReplicatedComponent() {
    java.util.List<edu.uci.eecs.wukong.framework.model.Component> components = map.getReplicatedComponent();
    edu.uci.eecs.wukong.framework.model.Component self = null;
    for (edu.uci.eecs.wukong.framework.model.Component component : components) {
        if ((component.getPrimaryEndPoint().getNodeId()) == (poller.getLongAddress())) {
            self = component;
            break;
        }
    }
    if (self != null) {
        components.remove(self);
    }else {
        edu.uci.eecs.wukong.framework.prclass.SystemPrClass.LOGGER.error("Can't find the component reployed into the progression server");
    }
    return components;
}