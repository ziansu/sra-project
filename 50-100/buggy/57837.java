@java.lang.Override
public void addCandidateVectorToTrainingVector(FV fv) {
    if (this.learningCandidateFeatureVectors.contains(fv)) {
        this.learningCandidateFeatureVectors.remove(fv);
        this.trainingFeatureVectors.add(fv);
    }else
        throw new java.lang.IllegalArgumentException("EvaluationBench.addCandidateVectorToTrainingVector: no such candidate vector.");
    
    ranking = null;
    queryApplicabilities = null;
}