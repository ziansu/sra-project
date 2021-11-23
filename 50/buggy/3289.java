public boolean addVote(net.dv8tion.jda.core.entities.User vote) {
    if (!(skipper.contains(vote))) {
        skipper.add(vote);
        return true;
    }else
        return false;
    
}