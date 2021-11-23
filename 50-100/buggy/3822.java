@java.lang.Override
public com.treestar.lib.xml.SElement getElement() {
    com.treestar.lib.xml.SElement result = new com.treestar.lib.xml.SElement(getName());
    if (!(parameterNames.isEmpty())) {
        com.treestar.lib.xml.SElement elem = new com.treestar.lib.xml.SElement("Parameters");
        result.addContent(elem);
        for (java.lang.String pName : parameterNames) {
            com.treestar.lib.xml.SElement s = new com.treestar.lib.xml.SElement("P");
            elem.setString("name", pName);
            elem.addContent(s);
        }
    }
    return result;
}