void onStart(io.github.totom3.dialogues.DialogueSession session) {
    java.util.Collection<org.bukkit.entity.Player> participants = new java.util.HashSet(session.getParticipants());
    for (org.bukkit.entity.Player player : participants) {
        io.github.totom3.dialogues.DialogueSession oldSession = sessions.put(player, session);
        if (((oldSession != null) && (oldSession != session)) && (!(oldSession.removeParticipant(player)))) {
            oldSession.terminate(false);
        }
    }
}