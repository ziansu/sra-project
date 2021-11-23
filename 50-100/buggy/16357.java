public static void main(java.lang.String[] args) throws java.lang.Exception {
    if ((args.length) < 2)
        java.lang.System.err.println("Usage: our-server <persistence-provider> <numberofdiffs>");
    
    java.lang.String persistenceProvider = args[0];
    int numberOfDiffs = java.lang.Integer.parseInt(args[1]);
    int portNumber = 8081;
    new server.Server(portNumber).run(persistenceProvider, numberOfDiffs);
}