public static void main(java.lang.String[] args) throws java.lang.Exception {
    java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
    while (true) {
        java.lang.System.out.print("Input a time: ");
        java.lang.String testInput = sc.nextLine();
        org.jimple.planner.TimeParser tp = new org.jimple.planner.TimeParser();
        java.util.Calendar t = tp.parseTime(testInput);
        if (t != null) {
            java.lang.System.out.println("Time parsed to:");
            java.lang.System.out.println(t.get);
        }
    } 
}