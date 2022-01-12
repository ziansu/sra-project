@java.lang.Override
public void run() {
    preferences.put(imagesurf.ImageSurfSettings.IMAGESURF_BAG_SIZE, bagSize);
    preferences.put(imagesurf.ImageSurfSettings.IMAGESURF_EXAMPLE_PORTION, examplePortion);
    preferences.put(imagesurf.ImageSurfSettings.IMAGESURF_TREE_DEPTH, treeDepth);
    preferences.put(imagesurf.ImageSurfSettings.IMAGESURF_NUM_TREES, numTrees);
    preferences.put(imagesurf.ImageSurfSettings.IMAGESURF_NUM_ATTRIBUTES, numAttributes);
    preferences.put(imagesurf.ImageSurfSettings.IMAGESURF_RANDOM_SEED, ((randomSeedString) == null ? "" : randomSeedString));
    preferences.put(imagesurf.ImageSurfSettings.IMAGESURF_MAX_FEATURES, maxFeatures);
    super.run();
}