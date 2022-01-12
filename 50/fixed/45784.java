public void onRelease() {
    if (!(isHeld)) {
        onHit();
    }
    BeatMap.keyHeld[index] = false;
    isHit = true;
}