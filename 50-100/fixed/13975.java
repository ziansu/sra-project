@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public <T> T getBeanOfType(java.lang.Class<T> clazz) {
    if (com.orientechnologies.orient.core.db.object.ODatabaseObjectTx.class.isAssignableFrom(clazz)) {
        return ((T) (objectDB));
    }else
        if (com.orientechnologies.orient.core.db.graph.OGraphDatabase.class.isAssignableFrom(clazz)) {
            return ((T) (graphDB));
        }else
            if (com.orientechnologies.orient.core.db.document.ODatabaseDocumentTx.class.isAssignableFrom(clazz)) {
                return ((T) (documentDB));
            }else {
                return null;
            }
        
    
}