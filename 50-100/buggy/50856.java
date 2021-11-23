private void printOpenDoors() {
    int zaehler = 0;
    java.lang.System.out.println("Offene Faecher:");
    for (int f = 0; f < 100; f++)
        if ((fach[f]) == (OFFEN)) {
            java.lang.System.out.print(((f + 1) + " "));
            zaehler++;
        }
    
    java.lang.System.out.println(("Insgesamt:" + zaehler));
}