public int generateMemoryReq() {
    java.util.Random rand = new java.util.Random();
    int n = (rand.nextInt(48)) + 16;
    return n;
}