public int compare(Paxos.ProposalId rhs) {
    if ((this.id) == (rhs.id)) {
        if ((rhs.playerId) == (this.playerId)) {
            return 0;
        }else
            if ((this.playerId) < (rhs.playerId)) {
                return -1;
            }else {
                return 1;
            }
        
    }else
        if ((this.id) < (rhs.id)) {
            return -1;
        }else {
            return 1;
        }
    
}