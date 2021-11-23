@java.lang.Override
public T fromString(java.lang.String string) {
    try {
        return ((T) (string));
    } catch (java.lang.ClassCastException e) {
        java.lang.String s = "Can not convert user input into generic type. " + ("Please provide a custom ComboBox converter to " + "support this form of user input.");
        throw new java.lang.RuntimeException(s);
    }
}