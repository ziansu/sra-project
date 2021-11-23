private void setNodeProperty(java.util.List<ca.nrc.cadc.beacon.web.resources.NodeProperty> nodeProperties, java.lang.String propertyName, java.lang.String propertyValue) {
    nodeProperties.remove(new ca.nrc.cadc.beacon.web.resources.NodeProperty(propertyName, ""));
    if (!(ca.nrc.cadc.util.StringUtil.hasLength(propertyValue))) {
        ca.nrc.cadc.beacon.web.resources.NodeProperty np = new ca.nrc.cadc.beacon.web.resources.NodeProperty(propertyName, "");
        np.setMarkedForDeletion(true);
        nodeProperties.add(np);
    }else {
        nodeProperties.add(new ca.nrc.cadc.beacon.web.resources.NodeProperty(propertyName, propertyValue));
    }
}