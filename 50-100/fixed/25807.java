public java.lang.String getClassHierarchy(java.lang.Object obj) {
    java.util.ArrayList<java.lang.String> classHierarchy = new java.util.ArrayList();
    java.lang.Class objClassRef = obj.getClass();
    while (objClassRef != null) {
        classHierarchy.add(objClassRef.toString());
        objClassRef = objClassRef.getSuperclass();
    } 
    return format(classHierarchy);
}