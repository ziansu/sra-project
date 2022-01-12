private void fillTargetByParameters(belhard.web.Dispatcher.Target target, java.util.Map<java.lang.String, java.lang.String[]> parametersMap) {
    java.lang.reflect.Parameter[] parameters = target.method.getParameters();
    for (int i = 0; i < (parameters.length); i++) {
        java.lang.String[] strings = parametersMap.get(parameters[i].getName());
        if (strings != null) {
            target.params[i] = strings[0];
        }
    }
}