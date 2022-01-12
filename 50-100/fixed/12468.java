protected java.lang.reflect.Method getMethod(int amountOfParams) throws java.lang.ClassNotFoundException {
    if (!(methods.containsKey(amountOfParams))) {
        synchronized(this) {
            if (!(methods.containsKey(amountOfParams))) {
                java.lang.String fullName = ((java.lang.String) (be.nabu.libs.evaluator.impl.MethodOperation.getParts().get(0).getContent()));
                methods.put(amountOfParams, findMethod(fullName, amountOfParams));
            }
        }
    }
    return methods.get(amountOfParams);
}