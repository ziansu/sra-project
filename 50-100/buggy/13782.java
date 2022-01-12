public utils.FeatureVector createLabelFeatures(parser.DependencyInstance inst, parser.DependencyArcList arcLis, int mod, int type) {
    utils.FeatureVector fv = new utils.FeatureVector(numLabeledArcFeats);
    if (!(options.learnLabel))
        return fv;
    
    type = type + 1;
    int[] heads = inst.heads;
    int head = heads[mod];
    fv.addEntries(createLabeledArcFeatures(inst, head, mod, (type + 1)));
    return fv;
}