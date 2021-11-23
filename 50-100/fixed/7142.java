private static int addArguments(java.lang.String[] args) {
    int sum = 0;
    if ((args.length) < 1)
        return 0;
    else
        if (args[0].equals("-"))
            for (int i = 1; i < (args.length); i++)
                sum -= java.lang.Integer.valueOf(args[i]);
            
        else
            for (java.lang.String arg : args)
                sum += java.lang.Integer.valueOf(arg);
            
        
    
    return sum;
}