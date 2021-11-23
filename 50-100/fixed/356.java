public void run() {
    if (((main.Rules.TIMER) % 20) == 0) {
        if (hitBottom()) {
            current = colorizer.spawnBlock();
        }else {
            current = colorizer.drop(current, 1);
        }
    }
    (main.Rules.TIMER)++;
}