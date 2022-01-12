public static int intMenu(java.lang.String[] args) {
    if ((args.length) <= 2) {
        java.lang.System.out.println("Error: title with no options!");
        return -1;
    }
    int[] choices = new int[(args.length) - 1];
    for (int i = 1; i < (args.length); i++) {
        choices[i] = i + 1;
    }
    return Util.intMenu(args, choices);
}