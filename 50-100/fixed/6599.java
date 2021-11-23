private static int argument(char[] array, int cursor, java.lang.StringBuilder argument) {
    for (int i = cursor; i < (array.length); i++) {
        char c = array[i];
        switch (c) {
            case ',' :
            case ')' :
                return i + 1;
            case ' ' :
                if ((argument.length()) == 0)
                    continue;
                
            default :
                argument.append(c);
        }
    }
    return array.length;
}