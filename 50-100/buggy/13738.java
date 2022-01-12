private void generateIcicle(int startTime) {
    int newPos = gen.nextInt(Box.TOTAL_BLOCK_POSITIONS);
    blocks.add(new Icicle(startTime, ((blockVelocity) * 2), newPos, 0, this));
    int randomDelay = gen.nextInt(800);
    startTime += randomDelay + 200;
}