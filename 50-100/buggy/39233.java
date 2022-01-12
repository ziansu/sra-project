private boolean terminatePath(int depth) {
    if (depth >= (maxDepth))
        return true;
    
    if (depth <= (minDepth))
        return false;
    
    rt.samplers.RandomSampler sampler = new rt.samplers.RandomSampler();
    float p = sampler.makeSamples(1, 1)[0][0];
    return p < (terminationProbability);
}