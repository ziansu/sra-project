public static void main(java.lang.String[] args) throws java.lang.Exception {
    java.lang.System.out.print("$> ");
    dubstep.Main.scan = new java.util.Scanner(java.lang.System.in);
    java.lang.String temp;
    while ((temp = dubstep.Main.scan.nextLine()) != null) {
        dubstep.Main.readQueries(temp);
        dubstep.Main.parseQueries();
        java.lang.System.out.print("$>");
    } 
    dubstep.Main.scan.close();
}