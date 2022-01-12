public static boolean classChecker(java.lang.String s, model.DocumentClass ic) {
    java.lang.String[] deelpath = s.split("/");
    return deelpath[((deelpath.length) - 1)].equals(ic.getName());
}