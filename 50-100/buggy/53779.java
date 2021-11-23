public static boolean isInRm(char[] c1, char[] c2) {
    boolean flag = false;
    int j = 0;
    for (int i = 0; i < (c2.length); i++) {
        if ((c1[(i + j)]) != (c2[i])) {
            if (flag)
                return false;
            
            flag = true;
            j = 1;
        }
    }
    return true;
}