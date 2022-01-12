protected static boolean hasCommand(java.lang.String command) {
    for (int i = 0; i < (console.Docopt.args.length); i++)
        if (console.Docopt.args[i].equals(command))
            return true;
        
    
    return false;
}