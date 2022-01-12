private java.util.List<com.xrosstools.xeda.editor.model.DepartmentNode> readDepartments(org.w3c.dom.Node machinesNode) {
    java.util.List<com.xrosstools.xeda.editor.model.DepartmentNode> machineList = new java.util.ArrayList<com.xrosstools.xeda.editor.model.DepartmentNode>();
    if (machinesNode == null)
        return machineList;
    
    org.w3c.dom.NodeList nodes = machinesNode.getChildNodes();
    for (int i = 0; i < (nodes.getLength()); i++) {
        if (isValidNode(nodes.item(i)))
            machineList.add(readDepartment(nodes.item(i)));
        
    }
    return machineList;
}