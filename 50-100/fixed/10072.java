private float getNoise(float x, float y, mapChooser.PerlinNoiseGenerator noise, float scale) {
    float n = 0;
    float weight = 1;
    float curFrequency = 1;
    for (int i = 0; i < (frequencies); i++) {
        n += weight * (noise.noise2((curFrequency * x), (curFrequency * y)));
        weight /= 2;
        curFrequency += 2;
    }
    return n;
}