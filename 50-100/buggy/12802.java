private void onClientHandle(com.impetus.kundera.persistence.handler.impl.EntitySaveGraph objectGraph, java.lang.Object childEntity) throws java.lang.Exception {
    if (childEntity instanceof java.util.Collection<?>) {
        java.util.Collection<?> childCol = ((java.util.Collection<?>) (childEntity));
        for (java.lang.Object ch : childCol) {
            onClientDelete(ch, objectGraph);
        }
    }else {
        onClientDelete(childEntity, objectGraph);
    }
}