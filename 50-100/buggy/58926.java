public static int formatDateOfWeek(java.lang.String s) {
    switch (s) {
        case "MON" :
            return 1;
        case "TUE" :
            return 2;
        case "WED" :
            return 3;
        case "THU" :
            return 4;
        case "FRI" :
            return 5;
        case "SAT" :
            return 6;
        case "SUN" :
            return 7;
    }
    return 0;
}