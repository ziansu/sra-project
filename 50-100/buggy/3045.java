private java.util.ArrayList<GenImage.CandidateImage> select() {
    final java.util.ArrayList<GenImage.CandidateImage> newCandidateImages = new java.util.ArrayList<GenImage.CandidateImage>(this.populationSize);
    @java.lang.SuppressWarnings(value = "NumericCastThatLosesPrecision")
    final int populationSurvivors = ((int) ((this.populationSize) * (this.retentionRate)));
    while ((newCandidateImages.size()) < populationSurvivors) {
        newCandidateImages.add(GenImage.Application.tournamentSelect(this.candidateImages, this.tournamentSize));
    } 
    return newCandidateImages;
}