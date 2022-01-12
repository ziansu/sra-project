@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public java.lang.Object getValue(java.lang.String name) {
    oms3.Access a = comp.output(name);
    java.lang.Object returningObject = null;
    try {
        returningObject = a.getField().get(comp.getComponent());
    } catch (java.lang.IllegalAccessException exception) {
        java.lang.System.out.println(exception.getMessage());
    }
    return returningObject;
}