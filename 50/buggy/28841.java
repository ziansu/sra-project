public void setMatchValidationLevel(eu.isas.peptideshaker.scoring.MatchValidationLevel matchValidationLevel) {
    zooActivateWrite();
    setModified(true);
    this.matchValidationLevel = matchValidationLevel;
}