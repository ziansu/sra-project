public int calculateMove() {
    java.util.Random random = new java.util.Random();
    int newMove = random.nextInt(9);
    while (movesDone.contains(newMove)) {
        newMove = random.nextInt(64);
    } 
    return newMove;
}