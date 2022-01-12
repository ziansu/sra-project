private void getClassModifiers(java.lang.Class clazz, int numberOfTabs) {
    getTabs(numberOfTabs);
    java.lang.String modifiers = java.lang.reflect.Modifier.toString(clazz.getModifiers());
    if (modifiers.isEmpty()) {
        sb.append(("class " + (clazz.getSimpleName())));
    }else {
        sb.append(((modifiers + " class ") + (clazz.getSimpleName())));
    }
}