@java.lang.SuppressWarnings(value = "SimplifiableIfStatement")
private static boolean isQualifierType(java.lang.Class clazz) {
    if (com.splicemachine.db.iapi.store.access.Qualifier.class.isAssignableFrom(clazz))
        return true;
    else
        if (clazz.isArray()) {
            return com.splicemachine.derby.serialization.ActivationSerializer.isQualifierType(clazz.getComponentType());
        }else
            return false;
        
    
}