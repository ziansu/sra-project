@java.lang.Override
public java.lang.String handleToken(java.lang.String content) {
    for (java.util.Map<java.lang.String, java.lang.Object> variable : variables) {
        if ((variable != null) && (variable.containsKey(content))) {
            return variable.get(content).toString();
        }
    }
    return ("${" + content) + "}";
}