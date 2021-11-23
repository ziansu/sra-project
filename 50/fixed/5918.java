public static sneer.flux.Action sendMessage(long id, java.lang.String text) {
    return sneer.flux.Action.action("send-message", "contact-id", id, "text", text);
}