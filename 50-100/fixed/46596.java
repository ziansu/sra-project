public static boolean exit_program(java.util.Scanner scan) {
    java.lang.String decision;
    do {
        java.lang.System.out.println("Do you want to exit the program? [Y/N]");
        decision = scan.nextLine();
    } while ((!(decision.equalsIgnoreCase("Y"))) && (!(decision.equalsIgnoreCase("N"))) );
    if (decision.equalsIgnoreCase("Y"))
        java.lang.System.out.println("\nSuccessfully exit the program");
    
    return decision.equalsIgnoreCase("Y");
}