void restoreLastSession() {
    if ((node.getChildren()) != null) {
        for (org.dsa.iot.dslink.node.Node child : node.getChildren().values()) {
            try {
                com.serotonin.bacnet4j.type.enumerated.PropertyIdentifier propid = com.serotonin.bacnet4j.type.enumerated.PropertyIdentifier.forName(child.getName());
                addProperty(propid);
            } catch (java.lang.Exception e) {
                child.delete(false);
            }
        }
    }
    init();
}