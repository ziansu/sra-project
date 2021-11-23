private boolean simpleMethodInvoke(java.lang.reflect.Method theMethod, java.lang.Object theObject) {
    try {
        theMethod.invoke(theObject, "");
        return true;
    } catch (java.lang.reflect.InvocationTargetException | java.lang.IllegalAccessException e) {
        return false;
    }
}