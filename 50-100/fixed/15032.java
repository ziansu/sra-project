private int checkTemp(final java.util.ArrayList<gamelogic.Square> temp, final int index) {
    int res = index;
    while (((!(temp.isEmpty())) && (res < ((temp.size()) - 1))) && (temp.get(res).getSymbol().getType().equals(SymbolColour.SPECIAL))) {
        ++res;
    } 
    return res;
}