protected static java.lang.reflect.Method getMethod(java.lang.Class classRef, java.lang.String methodName, java.lang.Class... methodParm) {
    try {
        org.activiti.dmn.engine.test.TestCustomExpressionFunctionRegistry.logger.debug("adding method to MVEL: {} {} with {} parameters", classRef.getName(), methodName, methodParam.length);
        return classRef.getMethod(methodName, methodParm);
    } catch (java.lang.NoSuchMethodException nsme) {
        org.activiti.dmn.engine.test.TestCustomExpressionFunctionRegistry.logger.error(("Could not find method for name: " + methodName), nsme);
    }
    return null;
}