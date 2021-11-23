public void variables() {
    java.lang.reflect.Field[] variables = c.getFields();
    for (java.lang.reflect.Field currentField : variables) {
        com.utilsplus.logging.Log annos = currentField.getAnnotation(com.utilsplus.logging.Log.class);
        if (annos != null) {
            log((((currentField.getType()) + " ") + (currentField.getName())), "VARIABLE");
        }
    }
}