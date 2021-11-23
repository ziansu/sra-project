@java.lang.Override
public java.lang.String toPersistence(E obj) {
    if (obj == null)
        return null;
    
    return obj.toString();
}