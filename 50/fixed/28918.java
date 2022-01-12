public int roulletResult(int[] roullet) {
    if ((roullet.length) == 0)
        return -1;
    
    return roullet[new java.util.Random().nextInt(roullet.length)];
}