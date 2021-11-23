public void generateMap(int[] spaces) {
    if (spaces == null)
        spaces = new int[0];
    
    for (int i = 0; i < (spaces.length); i++) {
        this.spaces[i] = spaces[i];
    }
    for (int i = spaces.length; i < 500; i++) {
        this.spaces[i] = ((int) ((java.lang.Math.random()) * 200));
    }
}