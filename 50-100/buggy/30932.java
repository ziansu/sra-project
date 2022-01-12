private void getParameters(java.lang.reflect.Parameter[] parameters) {
    for (int i = 0; i < (parameters.length); i++) {
        sb.append((((parameters[i].getType().getSimpleName()) + " ") + (parameters[i].getName())));
        if (i < ((parameters.length) - 1)) {
            sb.append(", ");
        }
    }
}