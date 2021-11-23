@com.fasterxml.jackson.annotation.JsonIgnore
public void addToLosersSoFarList(com.intuit.wasabi.experimentobjects.Bucket.Label loser) {
    if ((this.losersSoFar) == null) {
        this.losersSoFar = new java.util.ArrayList<>();
    }else
        if (loser == null) {
            throw new java.lang.IllegalArgumentException();
        }else {
            this.losersSoFar.add(loser);
        }
    
}