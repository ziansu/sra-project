private void printOpenDoors() {
    int zaehler = 0;
    java.lang.System.out.println("Offene Faecher:");
    for (int f = 1; f <= 100; f++)
        if ((fach[(f - 1)]) == (OFFEN)) {
            java.lang.System.out.print((f + " "));
            zaehler++;
        }
    
    java.lang.System.out.println(("Insgesamt:" + zaehler));
}