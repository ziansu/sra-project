public com.russ4stall.crappie.result.CrappieResult executeMethod() {
    com.russ4stall.crappie.result.CrappieResult result = null;
    try {
        java.lang.Object controllerInstance = method.getDeclaringClass().newInstance();
        result = ((com.russ4stall.crappie.result.CrappieResult) (method.invoke(controllerInstance)));
    } catch (java.lang.InstantiationException | java.lang.reflect.InvocationTargetException e) {
        e.printStackTrace();
    } catch (java.lang.IllegalAccessException e) {
        e.printStackTrace();
    }
    return result;
}