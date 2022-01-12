public java.util.List<org.apache.stratos.messaging.domain.instance.Instance> getInstanceContextsWithParentId(java.lang.String parentInstanceId) {
    if (getInstanceIdToInstanceContextMap().isEmpty()) {
        return null;
    }
    java.util.List<org.apache.stratos.messaging.domain.instance.Instance> contexts = new java.util.ArrayList<org.apache.stratos.messaging.domain.instance.Instance>();
    if (parentInstanceId == null) {
        for (org.apache.stratos.messaging.domain.instance.Instance context : instanceIdToInstanceContextMap.values()) {
            if (parentInstanceId.equals(context.getParentId())) {
                contexts.add(context);
            }
        }
    }
    return contexts;
}