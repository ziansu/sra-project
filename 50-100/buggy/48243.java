public java.util.List<com.vaadin.client.ComponentConnector> getCurrentChildren() {
    java.util.List<com.vaadin.client.ComponentConnector> result = new java.util.ArrayList<com.vaadin.client.ComponentConnector>(getChildComponents()) {
        @java.lang.Override
        public boolean add(com.vaadin.client.ComponentConnector cc) {
            return (cc != null) && (super.add(cc));
        }
    };
    result.removeAll(headerConnectors);
    result.remove(outcomingPortletCandidate);
    result.add(incomingPortletCandidate);
    return result;
}