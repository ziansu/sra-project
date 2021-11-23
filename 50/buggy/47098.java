@java.lang.Override
public void decodeMessage(java.lang.String message) {
    java.lang.String s = message.split(" ")[2];
    this.value = java.lang.Integer.parseInt(s);
}