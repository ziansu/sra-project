public int[] getPlayerLocation(int id) {
    int[] pos = new int[2];
    java.lang.String result = "";
    int counter = 0;
    while ((gl.processCommand("MOVE W", id)) != "FAIL") {
        counter++;
    } 
    pos[0] = 1 + counter;
    counter = 0;
    while ((gl.processCommand("MOVE N", id)) != "FAIL") {
        counter++;
    } 
    pos[1] = 1 + counter;
    return pos;
}