@java.lang.Override
public void invoke(java.util.Scanner args) {
    final java.lang.String message = (args.hasNext()) ? args.nextLine().trim() : "";
    if ((message.length()) > 0) {
        conversation.add(message);
    }else {
        java.lang.System.out.println("ERROR: Messages must contain text");
    }
}