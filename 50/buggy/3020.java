public java.awt.Component getComponentByName(java.lang.String name) {
    if (componentMap.containsKey(name)) {
        return ((java.awt.Component) (componentMap.get(name)));
    }else
        return null;
    
}