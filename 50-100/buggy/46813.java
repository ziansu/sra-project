private int[] readColors(java.lang.String string) {
    int[] colors = new int[0];
    java.util.StringTokenizer tokenizer = new java.util.StringTokenizer(string, COLOR_DELIMITER);
    int index = 0;
    while (tokenizer.hasMoreTokens()) {
        java.util.Arrays.copyOf(colors, ((colors.length) + 1));
        colors[index] = java.lang.Integer.parseInt(tokenizer.nextToken());
        index++;
    } 
    return colors;
}