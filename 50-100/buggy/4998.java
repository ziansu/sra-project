private static boolean thisRole(com.programma.engin.Args args1) {
    try {
        for (com.programma.engin.Permission perm : com.programma.engin.Permission.values()) {
            if (args1.role.equals(perm.toString())) {
                return true;
            }
        }
        return false;
    } catch (java.lang.IllegalArgumentException e) {
        return false;
    }
}