public void sendMessage(java.lang.String message) {
    java.lang.System.out.println(("Sending " + message));
    writer.println(message);
    writer.flush();
}