@java.lang.Override
public void transform(org.talend.designer.core.model.utils.emf.talendfile.NodeType node) {
    if (node == null) {
        return ;
    }
    org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType dataAction = org.talend.core.model.components.ComponentUtilities.getNodeProperty(node, "DATA_ACTION");
    if ("UPDATA".equals(dataAction.getValue())) {
        org.talend.core.model.components.ComponentUtilities.setNodeValue(node, "TABLE_ACTION", "NONE");
    }
}