public void resize() {
    result = new int[(pirate[0]) * 2];
    for (int z = 1; z < (pirate[0]); z++) {
        result[z] = pirate[z];
    }
    result[0] = result.length;
    pirate = result;
}