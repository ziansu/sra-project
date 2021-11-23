static void sendPrivateMissionMessage(net.dv8tion.jda.core.entities.User[] players) {
    for (net.dv8tion.jda.core.entities.User u : players) {
        u.getPrivateChannel().sendMessage("You have been selected for a mission, type !pass or !fail").queue();
    }
}