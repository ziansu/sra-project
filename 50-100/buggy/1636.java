@java.lang.SuppressWarnings(value = "unchecked")
private void createComponentMap(java.awt.Container container) {
    componentMap = new java.util.HashMap<java.lang.String, java.awt.Component>();
    java.awt.Component[] components = container.getComponents();
    for (int i = 0; i < (components.length); i++) {
        componentMap.put(components[i].getName(), components[i]);
    }
}