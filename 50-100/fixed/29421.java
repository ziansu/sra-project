public void set(java.lang.String key, java.lang.Object value) {
    net.unicoen.interpreter.Scope.assertNotUnicoen(value);
    if (variables.containsKey(key)) {
        variables.put(key, value);
        return ;
    }
    if ((parent) != null) {
        parent.set(key, value);
        return ;
    }
    throw new java.lang.RuntimeException((("variable " + key) + "is not declared."));
}