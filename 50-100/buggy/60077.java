public static int intMenu(java.lang.String title, int min, int max) {
    java.lang.String[] args = new java.lang.String[1];
    args[0] = title;
    int[] choices = new int[(max - min) + 1];
    for (int i = min; i <= max; i++) {
        choices[i] = i;
    }
    return Util.intMenu(args, choices);
}