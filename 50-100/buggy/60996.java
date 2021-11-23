@java.lang.Override
public java.lang.Number getValue() {
    java.lang.String value = (textBox.getValue().equals("")) ? "0" : textBox.getValue();
    try {
        return java.lang.Integer.valueOf(textBox.getValue());
    } catch (java.lang.NumberFormatException e) {
        return -1;
    }
}