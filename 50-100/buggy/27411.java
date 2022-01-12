public static int isNumber(java.lang.String s, int defaultValue) {
    java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
    try {
        sc.close();
        if (!(s.isEmpty())) {
            return java.lang.Integer.parseInt(s);
        }else {
            return defaultValue;
        }
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("La valeur entrée n'est pas un nombre. Réessayez.");
        return Console.isNumber(sc.nextLine(), defaultValue);
    }
}