public static void sendPrivate(net.dv8tion.jda.core.entities.User u, java.lang.String message) {
    if (u == null) {
        throw new java.lang.NullPointerException();
    }
    com.tazzie02.tazbotdiscordlib.SendMessage.sendMessage(u.getPrivateChannel(), message);
}