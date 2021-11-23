void onStart(io.github.totom3.dialogues.DialogueSession session) {
    java.util.Collection<org.bukkit.entity.Player> participants = session.getParticipants();
    for (org.bukkit.entity.Player player : participants) {
        io.github.totom3.dialogues.DialogueSession oldSession = sessions.put(player, session);
        if ((oldSession != null) && (!(oldSession.removeParticipant(player)))) {
            session.terminate(false);
        }
    }
}