public static int intMenu(java.lang.String title, int min, int max) {
    java.lang.String[] args = new java.lang.String[1];
    args[0] = title;
    int[] choices = new int[(max - min) + 1];
    for (int i = 0; i < (choices.length); i++) {
        choices[i] = min + i;
    }
    return Util.intMenu(args, choices);
}