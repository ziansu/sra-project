public static void throwError(int errorCode) {
    switch (errorCode) {
        case -1 :
            java.lang.System.out.println("FATAL ERROR! Please report this bug!");
            break;
        case -2 :
            java.lang.System.out.println("FATAL ERROR FOR DEBUG ONLY!");
            break;
        case -100 :
            java.lang.System.out.println("ERROR IN INPUT VALUES");
            break;
        case -101 :
            java.lang.System.out.println("ERROR IN ALL HASH ALGORITHMS");
            break;
        case -102 :
            java.lang.System.out.println("ERRIR IN SPECIFIC HASH");
            break;
    }
    java.lang.System.exit(errorCode);
}