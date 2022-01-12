public static java.lang.Object createObject(final java.lang.Class<?> clazz) {
    java.lang.Object object = null;
    try {
        object = clazz.newInstance();
    } catch (java.lang.InstantiationException | java.lang.IllegalAccessException e) {
        org.pojotester.log.PojoTesterLogger.debugMessage(("Not able to initialize using default constructor of " + (clazz.getName())), e);
        try {
            object = org.pojotester.utils.ClassUtilities.createObjectUsingOtherConstructor(clazz);
        } catch (java.lang.Exception ex) {
            org.pojotester.log.PojoTesterLogger.debugMessage(("Not able to initialize using other constructor of " + (clazz.getName())), e);
        }
    }
    return object;
}