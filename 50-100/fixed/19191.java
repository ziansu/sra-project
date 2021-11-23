public static void main(java.lang.String[] args) {
    if ((args.length) == 0)
        jplag.options.CommandLineOptions.usage();
    else {
        try {
            jplag.options.CommandLineOptions options = new jplag.options.CommandLineOptions(args, null);
            jplag.Program program = new jplag.Program(options);
            java.lang.System.out.println("initialize ok");
            program.run();
        } catch (jplag.ExitException ex) {
            java.lang.System.out.println(("Error: " + (ex.getReport())));
            java.lang.System.exit(1);
        }
    }
}