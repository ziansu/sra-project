public static void main(java.lang.String[] args) {
    if ((args.length) != 1) {
        java.lang.System.out.println("Please enter a filename! :)");
        java.lang.System.out.println("Usage: java Tempo <filename>");
        java.lang.System.exit(0);
    }
    Tempo.RequestHandler run = new Tempo.RequestHandler(args[0]);
    Tempo.ArgParser parser = new Tempo.ArgParser();
    java.lang.System.out.println(Tempo.Tempo.WELCOME_MESSAGE);
    Tempo.Tempo.listenForInput(run, parser);
}