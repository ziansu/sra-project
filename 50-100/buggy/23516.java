public static boolean PlayAgainOrNot() {
    java.lang.System.out.println(" \n Haluatko pelata uudelleen? y/n ");
    java.lang.String vastaus = Main.scanner.next();
    if (vastaus.matches("n")) {
        java.lang.System.out.println("N�hd��n taas!");
        java.lang.System.exit(0);
        return false;
    }else
        if (vastaus.matches("y")) {
            Main.GameIsOver = false;
            return true;
        }
    
    return true;
}