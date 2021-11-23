public void makeFirstSpeciesCounterpoint() {
    CantusFirmus cantusFirmus = makeCantusFirmus(false);
    TwoVoiceCounterpoint counterpoint = new TwoVoiceCounterpoint(cantusFirmus, 1);
    counterpoint.pseudoComposeFromScratchInFirstSpecies();
    this.playerString = counterpoint.toString();
    play();
}