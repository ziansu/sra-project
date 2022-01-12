public static void main(java.lang.String[] args) {
    nl.han.ica.ap.boerenbridge.spel.Spel spel = new nl.han.ica.ap.boerenbridge.spel.Spel();
    spel.neemDeel(new nl.han.ica.ap.boerenbridge.speler.computer.ComputerSpeler("cpu 1"));
    spel.neemDeel(new nl.han.ica.ap.boerenbridge.speler.computer.ComputerSpeler("cpu 2"));
    spel.neemDeel(new nl.han.ica.ap.boerenbridge.speler.computer.ComputerSpeler("cpu 3"));
    spel.neemDeel(new nl.han.ica.ap.boerenbridge.speler.computer.ComputerSpeler("cpu 4", "willekeurig", "montecarlo"));
    spel.neemDeel(new nl.han.ica.ap.boerenbridge.speler.mens.Speler("Max"));
}