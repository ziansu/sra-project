public static void PostOnItVoteCanceled(int ideaId) {
    com.snepos.pitchit.database.Request req = new com.snepos.pitchit.database.Request("remove_on_it_vote", Request.App.MyPitch);
    req.put("idea_id", java.lang.String.valueOf(ideaId));
    req.put("email", com.snepos.pitchit.Login.GetUserEmail());
    com.snepos.pitchit.database.HttpHandler.addRequest(req);
    if (com.snepos.pitchit.database.Database.on_it_votes.contains(ideaId))
        com.snepos.pitchit.database.Database.on_it_votes.remove(((java.lang.Integer) (ideaId)));
    
}