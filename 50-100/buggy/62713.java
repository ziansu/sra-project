public static void PostSpamVote(int ideaId) {
    com.snepos.pitchit.database.Request req = new com.snepos.pitchit.database.Request("add_spam_vote", Request.App.MyPitch);
    req.put("idea_id", java.lang.String.valueOf(ideaId));
    req.put("email", com.snepos.pitchit.Login.GetUserEmail());
    com.snepos.pitchit.database.HttpHandler.addRequest(req);
    if (com.snepos.pitchit.database.Database.spam_votes.contains(ideaId))
        com.snepos.pitchit.database.Database.spam_votes.remove(((java.lang.Integer) (ideaId)));
    
}