public static void main(java.lang.String[] args) {
    boolean dbActive = true;
    while (dbActive) {
        java.util.Scanner in = new java.util.Scanner(java.lang.System.in);
        java.lang.String query = in.nextLine();
        java.lang.String[] pieces = query.split("\\s+");
        for (java.lang.String str : pieces) {
            java.lang.System.out.println(str);
        }
        dbActive = ParseQuery.executeQuery(pieces, dbActive);
    } 
}