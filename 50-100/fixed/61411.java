@java.lang.Override
public int getItemViewType(int position) {
    if (firstStart) {
        if (position == 0)
            return CardType.FIRST_START.ordinal();
        
        position--;
    }
    if (position == 0)
        return CardType.LARGE.ordinal();
    
    eu.unipv.epsilon.enigma.ui.main.CardType[] types = new eu.unipv.epsilon.enigma.ui.main.CardType[]{ CardType.MEDIUM , CardType.SMALL , CardType.TINY };
    return types[((position - 1) % (types.length))].ordinal();
}