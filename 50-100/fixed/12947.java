private void getClassModifiers(java.lang.Class clazz, int numberOfTabs) {
    getTabs(numberOfTabs);
    java.lang.String modifiers = java.lang.reflect.Modifier.toString(clazz.getModifiers());
    if (modifiers.isEmpty()) {
        sb.append("class ").append(clazz.getSimpleName());
    }else {
        sb.append(modifiers).append(" class ").append(clazz.getSimpleName());
    }
}