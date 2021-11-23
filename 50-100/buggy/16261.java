private java.util.List<com.xrosstools.xeda.editor.model.DepartmentNode> readDepartments(org.w3c.dom.Node machinesNode) {
    org.w3c.dom.NodeList nodes = machinesNode.getChildNodes();
    java.util.List<com.xrosstools.xeda.editor.model.DepartmentNode> machineList = new java.util.ArrayList<com.xrosstools.xeda.editor.model.DepartmentNode>();
    for (int i = 0; i < (nodes.getLength()); i++) {
        if (isValidNode(nodes.item(i)))
            machineList.add(readDepartment(nodes.item(i)));
        
    }
    return machineList;
}