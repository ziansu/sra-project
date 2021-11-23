@java.lang.Override
public void invoke(java.util.List<java.lang.String> args) {
    final java.lang.String message = args.get(0);
    args.remove(0);
    if ((message.length()) > 0) {
        conversation.add(message);
    }else {
        java.lang.System.out.println("ERROR: Messages must contain text");
    }
}