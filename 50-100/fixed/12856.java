@com.fasterxml.jackson.annotation.JsonIgnore
public void checkStatus() {
    if ((holes) == null) {
        this.status = PatternStatus.READY;
        return ;
    }
    for (businessentities.PatternHole aHole : holes) {
        if (((aHole.getPatternAssigned()) == null) || (aHole.getPatternAssigned().isEmpty())) {
            this.status = PatternStatus.WIP;
            return ;
        }
    }
    this.status = PatternStatus.READY;
}