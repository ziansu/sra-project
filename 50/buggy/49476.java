public void set(int id, float value) {
    while ((denseFeatures.size()) <= id)
        denseFeatures.add(0.0F);
    
    denseFeatures.set(id, value);
}