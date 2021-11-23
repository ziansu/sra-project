@java.lang.SuppressWarnings(value = "SimplifiableIfStatement")
private static boolean isQualifierType(java.lang.Class clazz) {
    while (true) {
        if (com.splicemachine.db.iapi.store.access.Qualifier.class.isAssignableFrom(clazz))
            return true;
        else
            if (clazz.isArray()) {
                clazz = clazz.getComponentType();
            }else
                return false;
            
        
    } 
}