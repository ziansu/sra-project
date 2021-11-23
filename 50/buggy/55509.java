public void run(com.applitools.eyes.Eyes eyes) throws java.io.IOException {
    if (hasRegionFile())
        throw new java.lang.RuntimeException("Hurry, You found a bug! This is region step, it should be executed through it's regions");
    
    eyes.checkImage(getImage(), name());
}