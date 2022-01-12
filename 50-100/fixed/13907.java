private int checkTemp(final java.util.ArrayList<gamelogic.Square> temp, final int index) {
    int res = index;
    while (((!(temp.isEmpty())) && (temp.get(res).getSymbol().getType().equals(SymbolColour.SPECIAL))) && (res < ((temp.size()) - 1))) {
        ++res;
    } 
    return res;
}