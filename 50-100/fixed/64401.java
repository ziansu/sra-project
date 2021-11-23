private static void validateArgs(java.lang.String[] args) {
    if (((args.length) != 4) && ((args.length) != 7)) {
        java.lang.System.out.print("\n\tFor regular icons, please enter 4 arguments:\n");
        java.lang.System.out.print("\tjava FontAwesome [size] [color] [padding] [format]\n");
        java.lang.System.out.print("\tex: \"java FontAwesome 48 0 1/8 png\"\n\n");
        java.lang.System.out.print("\tFor stacked icons, please enter 7 arguments:\n");
        java.lang.System.out.print("\tjava FontAwesome [size] [color] [padding] [format] [sicon] [ssize] [scolor]\n");
        java.lang.System.out.print("\tex: \"java FontAwesome 24 ffffff 0 png square 48 0\"\n");
        java.lang.System.exit(0);
    }
}