public static boolean PlayAgainOrNot() {
    java.lang.System.out.println(" \n Haluatko pelata uudelleen? y/n ");
    java.lang.String answer = Main.scanner.next();
    if (answer.matches("n")) {
        java.lang.System.out.println("N�hd��n taas!");
        java.lang.System.exit(0);
        return false;
    }else
        if (answer.matches("y")) {
            Main.GameIsOver = false;
            return true;
        }
    
    return true;
}