public java.lang.String getArguments(java.lang.String[] args, int start) {
    java.lang.String result = "";
    if (start < (args.length)) {
        for (int i = start; i < (args.length); i++)
            result += (i != start ? " " : "") + (args[i]);
        
    }
    return result;
}