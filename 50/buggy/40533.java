private boolean searchRadiusAndBucket() {
    minImpRadius = searchMinRadiusInBucket(neo.landscape.theory.apps.pseudoboolean.hillclimbers.mo.MultiObjectiveSelector.STRONGLY_IMPROVING_BUCKET);
    if ((minImpRadius) >= 1) {
        impBucket = neo.landscape.theory.apps.pseudoboolean.hillclimbers.mo.MultiObjectiveSelector.STRONGLY_IMPROVING_BUCKET;
    }else {
        minImpRadius = searchMinRadiusInBucket(neo.landscape.theory.apps.pseudoboolean.hillclimbers.mo.MultiObjectiveSelector.WEAKLY_IMPROVING_BUCKET);
        impBucket = neo.landscape.theory.apps.pseudoboolean.hillclimbers.mo.MultiObjectiveSelector.STRONGLY_IMPROVING_BUCKET;
    }
    return (minImpRadius) >= 1;
}