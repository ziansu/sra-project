public void addFrame(micropolisj.graphics.TileImage img, int duration) {
    totalDuration += duration;
    micropolisj.graphics.Animation.Frame f = new micropolisj.graphics.Animation.Frame(img, duration);
    frames.add(f);
}