private java.util.HashSet<GenImage.CandidateImage> select() {
    final java.util.HashSet<GenImage.CandidateImage> newCandidateImages = new java.util.HashSet<GenImage.CandidateImage>(this.populationSize);
    @java.lang.SuppressWarnings(value = "NumericCastThatLosesPrecision")
    final int populationSurvivors = ((int) ((this.populationSize) * (this.retentionRate)));
    while ((newCandidateImages.size()) < populationSurvivors) {
        newCandidateImages.add(GenImage.Application.tournamentSelect(this.candidateImages, this.tournamentSize));
    } 
    return newCandidateImages;
}