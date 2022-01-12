private static int checkargumentlength(java.lang.String[] args) throws java.lang.Exception {
    if (((args.length) == 1) && (args[0].equals("-README"))) {
        java.lang.System.out.println(("This program creates a new appointment for the owner specified and saves it in the\n" + "Appointment class. It can also optionally print the appointment details."));
        java.lang.System.exit(0);
    }else
        if (((args.length) < 6) && ((args.length) != 1)) {
            throw new java.lang.Exception();
        }else
            if ((args.length) > 8) {
                throw new java.lang.Exception();
            }
        
    
    return args.length;
}