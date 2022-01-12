public static void main(java.lang.String[] args) {
    if ((args.length) == 0) {
        new wolf.parser.Parser().parse();
    }else {
        for (java.lang.String filename : args) {
            java.lang.System.out.println(("Parsing " + filename));
            try {
                new wolf.parser.Parser().parse(filename);
            } catch (java.lang.IllegalArgumentException iae) {
                java.lang.System.out.println(iae.getMessage());
            }
        }
    }
}