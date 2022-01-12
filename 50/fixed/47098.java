@java.lang.Override
public void decodeMessage(java.lang.String message) {
    message = message.trim();
    java.lang.String s = message.split(" ")[2];
    this.value = java.lang.Integer.parseInt(s);
}