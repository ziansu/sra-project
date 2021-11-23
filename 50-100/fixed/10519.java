public static void printPlainMessage(objects.PlainMessage message) {
    java.lang.System.out.println();
    java.lang.System.out.println(message.getMessageText());
    java.lang.System.out.println(java.util.Arrays.toString(message.getMessageDecimalArray()));
    java.lang.System.out.println(message.getMessageHex());
    java.lang.System.out.println(message.getMessageBinary());
}