public static int calculScore(int lgTab, int nbrVies) {
    if (lgTab < 5) {
        return (lgTab * nbrVies) * 3;
    }else
        if (lgTab > 8) {
            return (lgTab * nbrVies) * 2;
        }else {
            return lgTab * nbrVies;
        }
    
}