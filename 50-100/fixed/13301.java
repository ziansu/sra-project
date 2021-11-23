public void addTegenstander(java.lang.String tgn) {
    speelgeschiedenis = (speelgeschiedenis) + (tegenstanders[0].substring(0, 2));
    tegenstanders[0] = tegenstanders[1];
    tegenstanders[1] = tegenstanders[2];
    tegenstanders[2] = tegenstanders[3];
    tegenstanders[3] = tgn;
}