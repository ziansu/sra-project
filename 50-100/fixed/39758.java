public static boolean isReplace(char[] c1, char[] c2) {
    boolean flag = false;
    for (int i = 0; i < (c2.length); i++) {
        if ((c1[i]) != (c2[i])) {
            if (flag)
                return false;
            
            flag = true;
        }
    }
    return true;
}