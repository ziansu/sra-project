public void tick() {
    (tickCount)++;
    for (int i = 0; i < (pixels.length); i++) {
        pixels[i] = i + (tickCount);
    }
}