public void removeSubRequest(PlayerObject player) {
    for (SubRequestObject req : subRequests) {
        if (req.playerToBeReplaced.equals(player))
            subRequests.remove(req);
        
    }
}