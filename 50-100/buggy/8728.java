public int compare(Paxos.ProposalId rhs) {
    if ((this.id) == (rhs.id)) {
        return java.lang.Integer.compare(this.playerId, rhs.playerId);
    }else
        if ((this.id) < (rhs.id)) {
            return -1;
        }else {
            return 1;
        }
    
}