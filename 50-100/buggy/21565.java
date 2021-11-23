public static java.lang.String numToString(int num) {
    switch (num) {
        case 0 :
            return "zero";
        case 1 :
            return "one";
        case 2 :
            return "two";
        case 3 :
            return "three";
        case 4 :
            return "four";
        case 5 :
            return "five";
        case 6 :
            return "six";
        default :
            return "Number outside of the bounds for current game implementation.";
    }
}