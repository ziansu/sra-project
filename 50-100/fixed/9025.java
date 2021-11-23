private com.progressoft.jip.ui.action.Action<T> generateAction(com.progressoft.jip.ui.xml.element.ActionXml actionXml) {
    try {
        java.lang.Object newInstance = newActionInstance(actionXml);
        return ((com.progressoft.jip.ui.action.Action<T>) (newInstance));
    } catch (java.lang.InstantiationException | java.lang.IllegalAccessException | java.lang.ClassNotFoundException | java.lang.SecurityException | java.lang.NoSuchMethodException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException e) {
        throw new com.progressoft.jip.ui.xml.UserInterfaceParsingException(e);
    }
}