public static void throwError(int errorCode) {
    switch (errorCode) {
        case -1 :
            java.lang.System.out.println("FATAL ERROR! Please report this bug!");
        case -2 :
            java.lang.System.out.println("FATAL ERROR FOR DEBUG ONLY!");
        case -100 :
            java.lang.System.out.println("ERROR IN INPUT VALUES");
        case -101 :
            java.lang.System.out.println("ERROR IN ALL HASH ALGORITHMS");
        case -102 :
            java.lang.System.out.println("ERRIR IN SPECIFIC HASH");
    }
    java.lang.System.exit(errorCode);
}