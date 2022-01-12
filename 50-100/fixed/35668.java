@java.lang.Override
public void decodeMessage(java.lang.String message) {
    java.lang.String[] s = message.split(" ");
    if ((s.length) > 2) {
        int index = message.indexOf(s[1]);
        this.error = message.substring(((1 + index) + (s[1].length())));
    }
}