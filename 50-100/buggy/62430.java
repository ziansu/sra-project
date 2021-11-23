public void setScoredCredits(int scoredCredits, java.lang.Boolean hasCertificate) {
    if (scoredCredits > 100) {
        this.scoredCredits = 100;
    }else
        if (scoredCredits < 0) {
            this.scoredCredits = 100;
        }else {
            this.scoredCredits = scoredCredits;
        }
    
}