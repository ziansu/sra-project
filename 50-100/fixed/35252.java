private int[][] readStates(java.lang.String string) {
    int[][] states = new int[0][];
    java.util.StringTokenizer tokenizer = new java.util.StringTokenizer(string, STATE_DELIMITER);
    int index = 0;
    while (tokenizer.hasMoreTokens()) {
        states = java.util.Arrays.copyOf(states, ((states.length) + 1));
        states[index] = readColors(tokenizer.nextToken());
        index++;
    } 
    return states;
}