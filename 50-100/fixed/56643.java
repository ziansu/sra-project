public void generateMap(int[] spaces) {
    for (int i = 0; i < (spaces.length); i++) {
        this.spaces[i] = spaces[i];
    }
    for (int i = spaces.length; i < 500; i++) {
        this.spaces[i] = ((int) ((java.lang.Math.random()) * 200));
    }
}