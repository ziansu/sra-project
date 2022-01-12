protected java.util.List<java.awt.Component> getAllComponents(final java.awt.Container c) {
    java.util.List<java.awt.Component> compList = new java.util.ArrayList<java.awt.Component>();
    if (c == null) {
        return compList;
    }
    java.awt.Component[] comps = c.getComponents();
    for (java.awt.Component comp : comps) {
        compList.add(comp);
        if (comp instanceof java.awt.Container)
            compList.addAll(getAllComponents(((java.awt.Container) (comp))));
        
    }
    return compList;
}