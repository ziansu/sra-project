public java.util.List<edu.uci.eecs.wukong.framework.model.Component> getReplicatedComponent() {
    java.util.List<edu.uci.eecs.wukong.framework.model.Component> components = new java.util.ArrayList<edu.uci.eecs.wukong.framework.model.Component>();
    for (edu.uci.eecs.wukong.framework.model.Component component : components) {
        if ((component.getEndPointSize()) > 1) {
            components.add(component);
        }
    }
    return components;
}