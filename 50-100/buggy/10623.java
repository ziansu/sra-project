public static void find(java.lang.String arg, java.util.ArrayList<java.lang.String> list) {
    if ((list.indexOf(arg)) == (-1)) {
        java.lang.System.out.printf("%s not in list\n", arg);
    }else {
        java.lang.System.out.printf("%s in list at index %d\n", arg, list.indexOf(arg));
    }
}