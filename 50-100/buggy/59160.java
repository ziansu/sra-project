@java.lang.Override
public void body(java.lang.String namespace, java.lang.String name, java.lang.String text) throws java.lang.Exception {
    boolean value = ("true".equalsIgnoreCase(text)) || ("yes".equalsIgnoreCase(text));
    setter.invoke(digester.peek(), java.lang.Boolean.valueOf(value));
}