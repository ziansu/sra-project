public static int deleteType(java.lang.String s) {
    int type = -1;
    switch (s.substring(0, 1)) {
        case "d" :
            type = 4;
            break;
        case "e" :
            type = 1;
            break;
        case "f" :
            type = 2;
            break;
        default :
            break;
    }
    return type;
}