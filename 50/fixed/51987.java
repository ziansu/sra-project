public static void sendRawMessage(org.spongepowered.api.util.command.CommandSource sender, java.lang.String message) {
    if (sender == null) {
        java.lang.System.out.println(message);
    }else {
        sender.sendMessage(message);
    }
}