public int checkInt() {
    scan.nextLine();
    int input;
    while (!(scan.hasNextInt())) {
        scan.next();
        java.lang.System.out.print("Ungueltige Eingabe! Nochmal: ");
    } 
    input = scan.nextInt();
    return input;
}