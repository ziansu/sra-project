private int setThePlayers() {
    java.util.Scanner s = new java.util.Scanner(java.lang.System.in);
    int size = 0;
    do {
        java.lang.System.out.print("How many players are playing?: ");
        size = s.nextInt();
        java.lang.System.out.println();
        if ((size < 2) || (size > 4))
            java.lang.System.out.println(("Sorry that was an invalid number of players." + "Max is 4 and minimum is 2"));
        
    } while ((size < 2) || (size > 4) );
    return size;
}