public Party vote() {
    double maxScore = 0;
    Party maxParty = 0;
    for (int i = 0; i < (this.nation.parties.length); i++) {
        if ((score(this.nation.parties[i])) > maxScore) {
            maxScore = score(this.nation.parties[i]);
            maxParty = this.nation.parties[i];
        }
    }
    return maxParty;
}