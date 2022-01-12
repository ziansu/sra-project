public void populate(sample.app.seed.ISeed seed) {
    if (seed == null)
        return ;
    
    if (seed instanceof sample.app.seed.GrainSeed)
        populateGrain(((sample.app.seed.GrainSeed) (seed)));
    
    if (seed instanceof sample.app.seed.MonteCarloSeed)
        populateMC(((sample.app.seed.MonteCarloSeed) (seed)));
    else
        populateRandom(seed);
    
}