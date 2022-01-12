@java.lang.SuppressWarnings(value = "rawtypes")
public java.awt.Component getComponentByName(java.lang.String name, java.util.HashMap componentMap) {
    if (componentMap.containsKey(name)) {
        return ((java.awt.Component) (componentMap.get(name)));
    }else
        return null;
    
}