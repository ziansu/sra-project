public static void main(java.lang.String[] args) {
    if ((args.length) != 1) {
        try {
            int starWarsSequence = java.lang.Integer.parseInt(args[0]);
            java.lang.System.out.println(("Star Wars sequance: " + starWarsSequence));
        } catch (java.lang.NumberFormatException e) {
            java.lang.System.err.println((("Argument" + (args[0])) + " must be an integer."));
            java.lang.System.exit(2);
        }
    }else {
        java.lang.System.err.println("There must be exactly 1 argument.");
        java.lang.System.exit(1);
    }
}