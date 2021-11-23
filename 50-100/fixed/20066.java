public int getFreeBlock() {
    java.util.Random rand = new java.util.Random();
    for (int i = 0; i < 100; i++) {
        int randomNum = rand.nextInt(Memory.NUMBER_OF_BLOCKS);
        if ((!(usedBlock[randomNum])) && (randomNum <= (Memory.NUMBER_OF_BLOCKS))) {
            return randomNum;
        }
    }
    return -1;
}