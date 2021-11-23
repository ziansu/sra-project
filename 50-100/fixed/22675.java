@java.lang.Override
public java.lang.Character getCharacter(java.lang.String expression) {
    java.lang.Object value = this.getValue(expression);
    if (value instanceof java.lang.Character) {
        return ((java.lang.Character) (value));
    }
    if (value != null) {
        java.lang.String content = value.toString();
        if ((content.length()) > 0) {
            return content.charAt(0);
        }
    }
    return null;
}