public static java.lang.Object getValue(java.lang.reflect.Field declaredField, java.lang.Object obj) {
    java.lang.Object ob1 = obj;
    java.lang.Object val = null;
    while (ob1 != null) {
        try {
            val = declaredField.get(obj);
            break;
        } catch (java.lang.Exception e) {
            if ((ob1.getClass().getSuperclass()) != null) {
                ob1 = ob1.getClass().getSuperclass();
            }else {
                break;
            }
        }
    } 
    return val;
}