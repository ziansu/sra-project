public void generateMap(int[] spaces) {
    for (int i = 0; i < 5; i++) {
        this.spaces[i] = 100;
    }
    for (int i = 5; i < 10; i++) {
        this.spaces[i] = 178;
    }
    for (int i = 10; i < 500; i++) {
        this.spaces[i] = ((int) ((java.lang.Math.random()) * 200));
    }
}