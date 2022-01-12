public int parseRaceNumber() {
    int start = this.name.indexOf("_");
    int stop = this.name.indexOf("_", (start + 1));
    if ((start != (-1)) || (stop != (-1))) {
        java.lang.String sRaceNumber = this.name.substring((start + 1), stop);
        this.raceNumber = java.lang.Integer.parseInt(sRaceNumber);
        return this.raceNumber;
    }else
        return 1;
    
}