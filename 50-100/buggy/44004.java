public static void main(java.lang.String[] args) throws com.asual.lesscss.LessException, java.io.IOException {
    com.asual.lesscss.LessEngine engine = new com.asual.lesscss.LessEngine();
    if ((args.length) == 1) {
        java.lang.System.out.println(engine.compile(args[0]));
    }else
        if ((args.length) == 2) {
            engine.compile(new java.io.File(args[0]), new java.io.File(args[1]));
        }else {
            java.lang.System.err.println("Usage: java -jar lesscss-engine.jar <input_file> [<output_file>]");
        }
    
}